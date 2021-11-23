private mtrojanowski.revolut.domain.entity.User getUserFromCreateAccountDTO(mtrojanowski.revolut.consumes.CreateAccountDTO createAccountDTO) {
    java.lang.String firstName = createAccountDTO.getFirstName();
    java.lang.String lastName = createAccountDTO.getLastName();
    java.lang.String address = createAccountDTO.getAddress();
    return new mtrojanowski.revolut.domain.entity.User(generateRandomUUID(), firstName, lastName, address);
}