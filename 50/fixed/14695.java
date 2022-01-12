@java.lang.Override
public java.lang.String getQuestionSortType(java.lang.String sessionkey, java.lang.String isPreparation, java.lang.String subject) {
    de.thm.arsnova.entities.SortOrder sortOrder = databaseDao.getSortOrder(sessionkey, isPreparation, subject);
    return sortOrder.getSortType();
}