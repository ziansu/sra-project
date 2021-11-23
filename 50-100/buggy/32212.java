public java.lang.String loginWithCaptcha(java.lang.String it, java.lang.String username, java.lang.String password, java.lang.String captcha, java.lang.String label_id) throws java.io.IOException {
    java.lang.String html = authorization.postFormWithCaptcha(it, username, password, captcha);
    java.lang.System.out.println(html);
    if ((html.equals(Constant.HTTP_ERROR)) || (html.equals(Constant.HTTP_URL_ERROR))) {
        return html;
    }else {
        return saveUserInfo(html, label_id);
    }
}