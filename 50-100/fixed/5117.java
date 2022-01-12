public void deleteClaim(com.cmput301.cs.project.models.Claim claim) {
    for (java.util.Iterator<com.cmput301.cs.project.models.Claim> iterator = mClaims.iterator(); iterator.hasNext();) {
        com.cmput301.cs.project.models.Claim current = iterator.next();
        if (current.getId().equals(claim.getId())) {
            iterator.remove();
        }
    }
    serialize();
}