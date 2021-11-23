public com.radoslav.microclimate.service.entities.User getUserByEmailAndPassword(java.lang.String email, java.lang.String password) throws com.radoslav.microclimate.service.exceptions.MicroclimateException {
    javax.persistence.EntityManager entityManager = null;
    try {
        com.radoslav.microclimate.service.helpers.ValidationUtil.validateEmail(email);
        com.radoslav.microclimate.service.helpers.ValidationUtil.validatePassword(password);
        return com.radoslav.microclimate.service.entities.User.findUserByEmailAndPassword(entityManager, email, password);
    } catch (javax.persistence.NoResultException exception) {
        throw new com.radoslav.microclimate.service.exceptions.UnauthorizedException("User does not exists.");
    } catch (javax.persistence.NonUniqueResultException exception) {
        throw new com.radoslav.microclimate.service.exceptions.InternalServerErrorException("Illegal database content.");
    }
}