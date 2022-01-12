public java.util.List<java.lang.Integer> findNewResponsesByRequestsIdAndDate(java.util.Set<java.lang.Integer> ids, long timeStamp, long timeRequest) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<java.lang.Integer> list = entityManager.createQuery(findNewByRequestsIdAndTime, java.lang.Integer.class).setParameter(1, ids).setParameter(2, timeStamp).setParameter(3, timeRequest).getResultList();
    return list;
}