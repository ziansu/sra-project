public int getUserOrdersCount(long user_id, int type, int flag) throws com.loocha.exception.ServerInternalException {
    java.lang.String condition = "";
    if (flag == 0) {
        condition = " and user_request.flag in (2,3)";
    }else
        condition = " and user_request.flag = " + flag;
    
    return query(com.loocha.exam.dao.ExamResultDAO.QUERY_USER_ORDERS_COUNT.replace("{condition}", condition), new java.lang.Object[]{ user_id }, new com.loocha.dao.callback.CallbackForInt());
}