public static sun.security.provider.certpath.OCSPResponse.ResponseStatus userExist(java.io.Serializable id) {
    com.enseirb.telecom.s9.db.UserDB userDatabase = new com.enseirb.telecom.s9.db.UserDB();
    if (true == (userDatabase.exists(id))) {
        return sun.security.provider.certpath.OCSPResponse.ResponseStatus.UNAUTHORIZED;
    }else {
        return sun.security.provider.certpath.OCSPResponse.ResponseStatus.SUCCESSFUL;
    }
}