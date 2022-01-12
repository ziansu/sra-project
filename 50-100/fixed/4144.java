private java.util.List<models.Order> retrieveOrderList(java.util.Calendar calendar, int uId, int pageCount) throws models.exceptions.OrderException {
    return repo.getPersonalOrdersAsClient(uId, pageCount, new java.sql.Date(calendar.getTime().getTime()), new java.sql.Date(java.util.Calendar.getInstance().getTime().getTime()));
}