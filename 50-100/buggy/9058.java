public br.com.service.radar.entity.User alreadyUser(java.lang.String login) {
    try {
        br.com.service.radar.persistence.TypedQuery<br.com.service.radar.entity.User> messageTypedQuery = entityManager.createNamedQuery(User.FIND_USER_BY_LOGIN, br.com.service.radar.entity.User.class);
        messageTypedQuery.setParameter("cpf", login);
        return messageTypedQuery.getSingleResult();
    } catch (br.com.service.radar.persistence.NoResultException noResultException) {
        log.info("User Not found  email [{}]", login);
        return null;
    } catch (br.com.service.radar.persistence.PersistenceException persistenceException) {
        log.error("Erro ao buscar user, email [{}]", login, persistenceException);
        throw persistenceException;
    }
}