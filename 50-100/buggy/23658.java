public boolean validateData(java.lang.String username, java.lang.String pass) {
    member.model.FindPwDAO dao = new member.model.dao.FindPwDAOjdbc();
    member.model.FindPwBean bean = dao.select(username);
    if ((username.equals(bean.getUserName())) && (pass.equals(member.changedata.TOTP.getTOTP(bean.getUserName(), bean.getRequestTime())))) {
        return true;
    }
    return false;
}