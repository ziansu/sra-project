public com.tramppizza.domains.Pizza getPizza(java.lang.Long id) {
    return menuRepository.findOne(id);
}