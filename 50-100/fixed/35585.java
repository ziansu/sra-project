@java.lang.Override
public com.uyoung.core.base.bean.Page<com.uyoung.core.api.model.ActivitySignUp> getPageByUid(java.lang.Integer uid, int offset, int limit) {
    java.util.Map<java.lang.String, java.lang.Integer> paramMap = new java.util.HashMap<>();
    paramMap.put("uid", uid);
    return selectPage("getPageByUid", paramMap, new org.apache.ibatis.session.RowBounds(offset, limit));
}