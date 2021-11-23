private entity.Usuario createUsuario(java.lang.String cod) {
    entity.Usuario nuevo = new entity.Usuario(java.lang.Integer.parseInt(cod), true);
    sesionBD.beginTransaction();
    sesionBD.save(nuevo);
    sesionBD.getTransaction().commit();
    return nuevo;
}