private java.lang.Long findId(java.lang.Long id, java.lang.String userName) {
    if (id != (-1)) {
        return id;
    }
    no.dusken.momus.model.Person person = personRepository.findByUsername(userName);
    if (person == null) {
        id = lastId;
        while ((personRepository.findOne(id)) != null) {
            id++;
        } 
        lastId = id;
        return id;
    }
    return person.getId();
}