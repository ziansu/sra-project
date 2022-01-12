public jacJarSoft.noteArkiv.model.User logon(jacJarSoft.noteArkiv.model.User logonInfo) {
    jacJarSoft.noteArkiv.model.User user = getEntityManager().find(jacJarSoft.noteArkiv.model.User.class, logonInfo.getNo());
    if ((user == null) || (!(user.getPassword().equals(logonInfo.getPassword()))))
        return null;
    
    return user;
}