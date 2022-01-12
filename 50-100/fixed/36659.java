public void addRol(java.lang.String nombre) throws com.herokuapp.ggrosario.exepciones.RolException {
    for (com.herokuapp.ggrosario.modelo.Rol unRol : this.roles) {
        if (unRol.getNombre().equals(nombre)) {
            throw new com.herokuapp.ggrosario.exepciones.RolException("Ya existe un rol con ese nombre.");
        }
    }
    this.roles.add(new com.herokuapp.ggrosario.modelo.Rol(nombre));
}