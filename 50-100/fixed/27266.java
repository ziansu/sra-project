public java.lang.String getRolActivo() {
    java.lang.String rol = null;
    if (play.mvc.Scope.Session.current().contains("role")) {
        rol = play.mvc.Scope.Session.current().get("role");
    }else {
        cambiarRolActivo(this.rolActivo);
        rol = this.rolActivo;
    }
    return rol;
}