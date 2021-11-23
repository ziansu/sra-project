@javax.ejb.TransactionAttribute(value = javax.ejb.TransactionAttributeType.REQUIRED)
public com.dorinbrage.easyrs.example.web.model.User update(com.dorinbrage.easyrs.example.web.model.User model) {
    return em.merge(model);
}