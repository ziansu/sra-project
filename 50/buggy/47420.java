public com.tramppizza.domains.Pizza getPizza(java.lang.String id) {
    return menuRepository.findOne(id);
}