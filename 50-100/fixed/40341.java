@org.springframework.transaction.annotation.Transactional
public void makeAdmin(java.lang.String username) {
    java.util.Optional<com.muneer.website.business.model.UserProfile> userExists = findUserByUsername(username);
    if (userExists.isPresent()) {
        javax.persistence.Query query = entityManager.createQuery("update UserProfile set admin=1 where username=?").setParameter(1, username);
        query.executeUpdate();
    }
}