@java.lang.Override
public org.sdgas.model.OwingMoney findByMsg(java.lang.String userId, java.lang.String content) {
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<java.lang.String, java.lang.Object>();
    params.put("userId", userId);
    params.put("content", content);
    return ((org.sdgas.model.OwingMoney) (this.findSpecialObject(org.sdgas.model.OwingMoney.class, params)));
}