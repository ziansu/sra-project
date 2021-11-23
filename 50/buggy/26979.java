protected final void deny() {
    deny(null);
    setStatus(HttpServletResponse.SC_FORBIDDEN);
}