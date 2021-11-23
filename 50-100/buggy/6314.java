@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<by.robotun.webapp.domain.Lot> selectMyResponsesLimitOffset(int offset, int idUser) throws by.robotun.webapp.exeption.DaoException {
    java.lang.Integer limit = java.lang.Integer.parseInt(propertyManager.getValue(PropertyName.AJAX_LOT_MAXSIZE));
    java.util.List<by.robotun.webapp.domain.Lot> lots = entityManager.createNamedQuery("Lot.findLotsRespondedUser").setParameter("id", idUser).setFirstResult((offset * limit)).setMaxResults(limit).getResultList();
    return lots;
}