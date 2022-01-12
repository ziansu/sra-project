private boolean checkToken() {
    java.lang.String token = this.getToken();
    java.lang.System.out.println(("thisdfdsfdf token is " + token));
    boolean rs = false;
    if ((org.apache.commons.lang.StringUtils.isEmpty(token)) || ((appuserService.getPhoneByTokenFromCache(token)) == null)) {
        rs = true;
    }
    return rs;
}