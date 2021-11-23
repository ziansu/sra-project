public crazy.vo.User update(crazy.vo.User user) {
    if (((user.getEmail()) == null) || (!(user.getEmail().equals(email)))) {
        user.setEmail(email);
        user.setEmailActivated(false);
    }
    user.setPhone(phone);
    user.setSociolname(sociolname);
    user.setStudentid(studentid);
    user.setProvinceid(provinceid);
    user.setCollegeid(collegeid);
    user.setInstituteid(instituteid);
    return user;
}