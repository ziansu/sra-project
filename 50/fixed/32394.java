protected void onLoginSubmit() {
    if ((org.apache.commons.lang3.StringUtils.isEmpty(loginUsername)) || (org.apache.commons.lang3.StringUtils.isEmpty(loginPassword))) {
        return ;
    }
    signInAndContinue(loginUsername, loginPassword);
}