public final void notfound() {
    this.set("me", this.getUser());
    this.show("/notfound.html", true);
    this.setStatus(HttpServletResponse.SC_NOT_FOUND);
}