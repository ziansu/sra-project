public de.meyer.kronik.entities.User userLoginCorrect(java.lang.String pseudonym, java.lang.String password) {
    de.meyer.kronik.entities.User local;
    local = userRepository.findByPseudonym(pseudonym);
    if ((local != null) && (local.getPassword().equals(password))) {
        return local;
    }
    return local;
}