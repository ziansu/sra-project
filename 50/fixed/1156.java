void addCookies(int pos, java.util.List<javax.servlet.http.Cookie> cookies) {
    if ((this.cookies) == null) {
        this.cookies = new java.util.LinkedList<javax.servlet.http.Cookie>();
    }
    this.cookies.addAll(pos, cookies);
}