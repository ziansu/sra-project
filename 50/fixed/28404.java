public static boolean userExist(java.io.Serializable id) {
    com.enseirb.telecom.s9.db.UserDB userDatabase = new com.enseirb.telecom.s9.db.UserDB();
    return userDatabase.exists(id);
}