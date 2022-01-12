private void addRightsIfNotSameConcern(java.util.Collection<org.xwiki.contrib.nestedpagesmigrator.Right> rightsToAdd, java.util.Collection<org.xwiki.contrib.nestedpagesmigrator.Right> currentRights) {
    java.util.Iterator<org.xwiki.contrib.nestedpagesmigrator.Right> it = rightsToAdd.iterator();
    while (it.hasNext()) {
        org.xwiki.contrib.nestedpagesmigrator.Right localRight = it.next();
        for (org.xwiki.contrib.nestedpagesmigrator.Right currentRight : currentRights) {
            if (localRight.hasSameConcern(currentRight)) {
                it.remove();
                break;
            }
        }
    } 
    currentRights.addAll(rightsToAdd);
}