@org.springframework.transaction.annotation.Transactional
public void updateEmployee(com.softserve.edu.entity.user.User providerEmployee) {
    if ((providerEmployee.getPassword()) == "generate") {
        java.util.Random rand = new java.util.Random();
        java.lang.String newPassword = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(5);
        mail.sendNewPasswordMail(providerEmployee.getEmail(), providerEmployee.getFirstName(), newPassword);
        java.lang.String passwordEncoded = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder().encode(newPassword);
        providerEmployee.setPassword(passwordEncoded);
    }
    providerEmployeeRepository.save(providerEmployee);
}