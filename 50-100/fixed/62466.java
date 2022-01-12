@java.lang.Override
public org.codehaus.jettison.json.JSONObject toJSON() throws org.codehaus.jettison.json.JSONException {
    org.codehaus.jettison.json.JSONObject account = new org.codehaus.jettison.json.JSONObject();
    account.put(AccountEnum.ID, mId).put(AccountEnum.USERNAME, mUsername).put(AccountEnum.NICK_NAME, mNickName).put(AccountEnum.EMAIL, mEmail).put(AccountEnum.ENABLE, mEnable);
    return account;
}