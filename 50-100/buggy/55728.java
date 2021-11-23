public java.util.List<com.pisoft.asktheworld.data.ATWResponse> findModifiedResponsesByRequestsIdAndDate(java.util.Set<java.lang.Integer> ids, long timeStamp, long timeRequest) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<com.pisoft.asktheworld.data.ATWResponse> list = entityManager.createQuery(findModifiedByRequestsIdAndTime).setParameter(1, ids).setParameter(2, timeStamp).setParameter(3, timeRequest).getResultList();
    return list;
}