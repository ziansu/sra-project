public int getUserOrdersCount(long user_id, int type, int flag) throws com.loocha.exception.ServerInternalException {
    java.lang.String condition = "";
    if (type == 0) {
        condition = " and paid_id = 0 ";
    }else
        if (type == 1) {
            condition = " and paid_id > 0 ";
        }
    
    if (flag == 0) {
        condition = " and user_request.flag in (2,3)";
    }else
        condition = " and user_request.flag = " + flag;
    
    return query(com.loocha.exam.dao.ExamResultDAO.QUERY_USER_ORDERS_COUNT.replace("{condition}", condition), new java.lang.Object[]{ user_id }, new com.loocha.dao.callback.CallbackForInt());
}