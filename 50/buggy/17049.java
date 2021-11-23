@java.lang.Override
protected RequestDataUtil.ResponseObject doInBackground(java.lang.Void... params) {
    java.lang.String reqData = null;
    java.lang.String inviteCode = inviteCodeText.getText().toString();
    return org.cm.podd.report.util.RequestDataUtil.get(("/users/register/group/code/?invitationCode=" + inviteCode), reqData, null);
}