@java.lang.Override
public java.lang.Long getMaxPositionByCandidateId(java.lang.Long candidateId) {
    java.lang.StringBuilder sql = new java.lang.StringBuilder();
    sql.append("SELECT max(position)").append(" FROM chat_message").append(" WHERE chat_message.candidate_id =?0");
    javax.persistence.Query query = em.createNativeQuery(sql.toString());
    query.setParameter(0, candidateId);
    java.math.BigInteger position = ((java.math.BigInteger) (query.getSingleResult()));
    return position == null ? 0L : position.longValue();
}