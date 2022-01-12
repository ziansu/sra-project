public java.util.List<java.lang.Integer> findNewOutgoingResponsesByUserIdAndDate(int user_id, java.util.Date timeStamp, java.util.Date timeRequest) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<java.lang.Integer> list = entityManager.createQuery(findNewByUserIDAndTime, java.lang.Integer.class).setParameter(1, user_id).setParameter(2, timeStamp).setParameter(3, timeRequest).getResultList();
    return list;
}