public final void setNickname(java.lang.String newNickname) throws plugins.WebOfTrust.exceptions.InvalidParameterException {
    freenet.support.codeshortification.IfNull.thenThrow("Nickname is null");
    newNickname = newNickname.trim();
    plugins.WebOfTrust.Identity.validateNickname(newNickname);
    checkedActivate(1);
    if (((mNickname) != null) && (!(mNickname.equals(newNickname)))) {
        throw new plugins.WebOfTrust.exceptions.InvalidParameterException("Changing the nickname of an identity is not allowed.");
    }
    mNickname = newNickname;
    updated();
}