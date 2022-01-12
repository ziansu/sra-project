protected org.javarosa.core.model.instance.AbstractTreeElement setupFixtureData(org.javarosa.core.model.instance.ExternalDataInstance instance) {
    java.lang.String ref = instance.getReference();
    java.lang.String userId = "";
    org.javarosa.core.model.User u = mSandbox.getLoggedInUser();
    if (u != null) {
        userId = u.getUniqueId();
    }
    org.javarosa.core.model.instance.TreeElement fixtureRoot = loadFixtureRoot(instance, ref, userId);
    fixtureRoot.setParent(instance.getBase());
    return fixtureRoot;
}