protected java.lang.Integer getSequenceNbr(java.lang.String seqId) throws com.fb.util.FamilyBizException {
    java.util.Map<java.lang.String, java.lang.String> paramMap = new java.util.HashMap<java.lang.String, java.lang.String>();
    paramMap.put("PI_SEQ_ID", seqId);
    paramMap.put("PI_SEQ_PREFIX", com.fb.util.DateUtil.getDateString(new java.util.Date(), "yyyyMMdd"));
    this.getFbDao().call("getSequence", paramMap);
    return java.lang.Integer.valueOf(((java.lang.String) (paramMap.get("PO_SEQ_NBR"))));
}