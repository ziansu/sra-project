public void setCredentials(java.lang.String username, java.lang.String password) throws com.fasterxml.jackson.core.JsonProcessingException, java.io.IOException, org.ndexbio.model.exceptions.NdexException {
    this._username = username;
    this._password = password;
    if (((_username) != null) && ((username.length()) > 0)) {
        org.ndexbio.model.object.User currentUser = getNdexObject("/user?valid=true", _username, _password, "", org.ndexbio.model.object.User.class);
        _userUid = currentUser.getExternalId();
    }
}