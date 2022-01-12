private java.lang.Long findId(java.lang.Long id, java.lang.String userName) {
    no.dusken.momus.model.Person person = personRepository.findByUsername(userName);
    if (person == null) {
        id = (id == (-1)) ? lastId : id;
        while ((personRepository.findOne(id)) != null) {
            id++;
        } 
        lastId = id;
        return id;
    }
    return person.getId();
}