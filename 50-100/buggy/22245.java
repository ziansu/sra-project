@java.lang.Override
public int login(java.lang.String username, java.lang.String password) throws java.io.IOException {
    org.jsoup.Connection con = wotakutools.connect.Jsoup.connect(wotakutools.connect.ConnectFortune.LOGINURI).data("login_id", username).data("login_pw", password).data("submit", "ログイン").cookies(cookies).method(Method.POST);
    org.jsoup.Connection.Response response = con.execute();
    this.cookies = response.cookies();
    return response.statusCode();
}