public modelo.Usuario insertNewUser(java.lang.String username, java.lang.String nombre, java.lang.String apellido, java.lang.String email, java.lang.String pw, java.lang.String foto) {
    javax.persistence.EntityManager em = getEntityManager();
    javax.persistence.Query query = em.createNamedQuery("Usuario.insertNewUser");
    query.setParameter("username", username);
    query.setParameter("nombre", nombre);
    query.setParameter("apellido", apellido);
    query.setParameter("email", email);
    query.setParameter("pw", pw);
    query.setParameter("foto", foto);
    return null;
}