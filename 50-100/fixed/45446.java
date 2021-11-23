public java.util.List<com.pisoft.asktheworld.data.ATWResponse> findModifiedOutgoingRequestsByUserIdAndDate(int user_id, java.util.Date timeStamp, java.util.Date timeRequest) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<com.pisoft.asktheworld.data.ATWResponse> list = entityManager.createQuery(findModifiedByUserIDAndTime).setParameter(1, user_id).setParameter(2, timeStamp).setParameter(3, timeRequest).getResultList();
    return list;
}