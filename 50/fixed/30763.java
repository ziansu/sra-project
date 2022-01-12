public void saveData(org.openedit.Data inData, org.openedit.users.User inUser) {
    getXmlUserArchive().saveGroup(((org.openedit.users.Group) (inData)));
    super.saveData(inData, inUser);
}