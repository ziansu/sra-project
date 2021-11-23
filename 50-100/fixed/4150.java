public blog.model.User checkUser(java.lang.String email, java.lang.String pw) {
    blog.model.User u = this.userDao.findByUserName(email);
    if (u == null) {
        return null;
    }
    if ((u.getPw()) == null) {
        return null;
    }
    pw = blog.startup.Tools.digestSha1(pw);
    if (pw.equals(u.getPw())) {
        return u;
    }
    return null;
}