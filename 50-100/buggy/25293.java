private au.edu.uq.cmm.aclslib.message.Request readLogoutRequest(java.util.Scanner scanner, au.edu.uq.cmm.aclslib.message.RequestType type) {
    java.lang.String userName = nextName(scanner);
    expect(scanner, AbstractMessage.DELIMITER);
    expect(scanner, AbstractMessage.ACCOUNT_DELIMITER);
    java.lang.String account = nextAccount(scanner);
    java.lang.String facility = null;
    if (type == (RequestType.VIRTUAL_LOGOUT)) {
        expect(scanner, AbstractMessage.DELIMITER);
        expect(scanner, AbstractMessage.FACILITY_DELIMITER);
        facility = nextSubfacility(scanner);
    }
    expectEnd(scanner);
    return new au.edu.uq.cmm.aclslib.message.LogoutRequest(type, userName, account, facility);
}