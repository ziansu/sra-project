@java.lang.Override
public java.lang.Long insertAccount(com.peets.socialplay.server.Account account) {
    return db.insertAccountRecord(account.getIdentity().getIdentityType(), "", account.getName(), account.getIdentity().getIdentityStr(), false);
}