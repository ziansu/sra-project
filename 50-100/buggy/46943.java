public boolean isCommentAllowed(int code, int paramIndex) {
    if (FUNCTION_PARAM_COMMENT.containsKey(java.lang.Integer.valueOf(code))) {
        return (FUNCTION_PARAM_COMMENT.get(java.lang.Integer.valueOf(code)).intValue()) >= paramIndex;
    }else {
        return true;
    }
}