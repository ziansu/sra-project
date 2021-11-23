public void editClaim(com.cmput301.cs.project.models.Claim oldClaim, com.cmput301.cs.project.models.Claim newClaim) {
    for (final java.util.Iterator<com.cmput301.cs.project.models.Claim> iterator = mClaims.iterator(); iterator.hasNext();) {
        com.cmput301.cs.project.models.Claim current = iterator.next();
        if (current.getId().equals(oldClaim.getId())) {
            iterator.remove();
        }
    }
    mClaims.add(newClaim);
    serialize();
}