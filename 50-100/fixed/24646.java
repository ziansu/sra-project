public void applyToEntity(pl.lodz.p.ftims.tournamentpp.entities.AccountEntity accountEntity, org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
    if (((password) != null) && (!(password.isEmpty()))) {
        accountEntity.setPassword(passwordEncoder.encode(password));
    }
    accountEntity.setName(name);
    accountEntity.setEmail(email);
    accountEntity.setBirthdate(birthdate);
    accountEntity.setPhone(phone);
    accountEntity.setDescription(description);
}