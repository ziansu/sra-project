@java.lang.Override
@org.molgenis.security.core.runas.RunAsSystem
public void changePassword(java.lang.String username, java.lang.String newPassword) {
    org.molgenis.auth.MolgenisUser user = dataService.query(org.molgenis.security.account.MOLGENIS_USER, org.molgenis.auth.MolgenisUser.class).eq(org.molgenis.security.account.USERNAME, username).findOne();
    if (user == null) {
        throw new org.molgenis.security.user.MolgenisUserException(java.lang.String.format("Unknown user [%s]"));
    }
    user.setPassword(newPassword);
    user.setChangePassword(false);
    dataService.update(org.molgenis.security.account.MOLGENIS_USER, user);
    org.molgenis.security.account.AccountServiceImpl.LOG.info("Changed password of user [{}]", username);
}