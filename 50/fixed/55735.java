public void altaUsuarioFromList(java.util.List<mx.trillas.seguimientoembarques.persitence.pojos.Usuario> list) throws java.lang.Exception {
    for (mx.trillas.seguimientoembarques.persitence.pojos.Usuario usuario : list) {
        if (usuario != null) {
            altaUsuario(usuario);
        }
    }
}