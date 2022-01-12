private eionet.webq.dao.orm.UserFile userFileServiceWillReturnUserFileFromCdr() {
    eionet.webq.dao.orm.UserFile userFile = new eionet.webq.dao.orm.UserFile();
    userFile.setId(1);
    userFile.setFromCdr(true);
    userFile.setAuthorized(true);
    when(userFileHelper.getUserFile(org.mockito.Matchers.anyInt(), org.mockito.Matchers.any(javax.servlet.http.HttpServletRequest.class))).thenReturn(userFile);
    return userFile;
}