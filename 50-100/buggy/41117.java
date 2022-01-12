public long insertIntention(long userId, java.lang.String number, int type, int obl, int sel, float score, com.loocha.exam.bean.IntentionData data) throws com.loocha.exception.ServerInternalException {
    java.lang.Object[] args = new java.lang.Object[]{ userId , number , type , obl , sel , score , data.toData().getBytes() , java.lang.System.currentTimeMillis() };
    return insert(com.loocha.exam.dao.ExamResultDAO.INSERT_INTENTION_RECORD_SQL, args);
}