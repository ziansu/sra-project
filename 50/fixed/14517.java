public jacJarSoft.noteArkiv.model.User getUser(java.lang.String userNo) {
    jacJarSoft.noteArkiv.model.User user = getEntityManager().find(jacJarSoft.noteArkiv.model.User.class, userNo.toLowerCase());
    return user;
}