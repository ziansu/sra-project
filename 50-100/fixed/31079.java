public org.codehaus.jettison.json.JSONObject toJSON() throws org.codehaus.jettison.json.JSONException {
    org.codehaus.jettison.json.JSONObject object = new org.codehaus.jettison.json.JSONObject();
    object.put(AttachFileEnum.ID, mId).put(AttachFileEnum.NAME, mName).put(AttachFileEnum.ISSUE_ID, mIssueId).put(AttachFileEnum.ISSUE_TYPE, mIssueType).put(AttachFileEnum.CREATE_TIME, mCreateTime);
    return object;
}