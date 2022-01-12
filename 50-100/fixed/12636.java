private entity.Usuario getUsrByName(java.lang.String usr) {
    entity.Usuario objetoUsuario;
    sesionBD.beginTransaction();
    org.hibernate.Query query = sesionBD.createQuery(("from Usuario where codigo = " + usr));
    objetoUsuario = ((entity.Usuario) (query.uniqueResult()));
    sesionBD.getTransaction().commit();
    return objetoUsuario;
}