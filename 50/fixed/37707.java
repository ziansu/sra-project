public boolean checkAdminPrincipal() {
    final boolean res;
    domain.Administrator principal;
    principal = this.administratorService.findByPrincipal();
    res = principal != null;
    return res;
}