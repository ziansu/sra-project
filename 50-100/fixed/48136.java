@java.lang.Override
public void removePerson(boets.adresbestand.domain.Person person) {
    boets.adresbestand.domain.Address address = addressRepository.findOne(person.getMainAddress().getId());
    if ((address.getPersons().size()) == 1) {
        logger.info("Only one person lives in this address; remove address as wel");
        personRepository.delete(person);
        addressRepository.delete(address);
    }else {
        logger.info("More persons live in this address; don not remove address");
        personRepository.delete(person);
    }
}