public boolean authenticate(java.lang.String username, java.lang.String password) {
    if ((username.equals("a")) && (password.equals("p"))) {
        setContentView(R.layout.home_layout);
        return true;
    }
    return false;
}