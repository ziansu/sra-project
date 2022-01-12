public void setEmail(java.lang.String email) throws edu.ctl.pinjobs.profile.model.WrongInputExeption {
    if ((!(infoCheck.isEmpty(email))) && (isEmailCorrect(email))) {
        this.email = email;
    }else {
        throw new edu.ctl.pinjobs.profile.model.WrongInputExeption("Email");
    }
}