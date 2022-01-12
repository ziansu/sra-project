@org.springframework.transaction.annotation.Transactional
public void editAccountFromCompteBean(fr.bougly.web.dtos.AccountDto accountDto) {
    fr.bougly.model.UserAccount accountFromDb = accountRepository.findByMail(accountDto.getMail());
    accountFromDb.setLastName(accountDto.getLastName());
    accountFromDb.setFirstName(accountDto.getFirstName());
    if ((accountDto.getRole()) == (RoleAccountEnum.Student.toString())) {
        fr.bougly.model.Student student = ((fr.bougly.model.Student) (accountFromDb));
        student.setStudentNumber(accountDto.getStudentNumber());
    }
}