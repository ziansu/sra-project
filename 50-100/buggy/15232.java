public void setPassword(java.lang.String password) throws edu.ctl.pinjobs.profile.model.WrongInputExeption {
    if ((infoCheck.isEmpty(password)) && ((password.length()) >= 2)) {
        this.password = password;
    }else {
        throw new edu.ctl.pinjobs.profile.model.WrongInputExeption("Password");
    }
}