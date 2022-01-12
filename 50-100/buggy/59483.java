private void clearCL() {
    ca.ualberta.cs.scandaloutraveltracker.ClaimListController clc = new ca.ualberta.cs.scandaloutraveltracker.ClaimListController(userSelectActivity);
    java.util.ArrayList<ca.ualberta.cs.scandaloutraveltracker.Claim> claims = clc.getClaimList().getClaims();
    java.util.Iterator<ca.ualberta.cs.scandaloutraveltracker.Claim> iterator = claims.iterator();
    while (iterator.hasNext()) {
        ca.ualberta.cs.scandaloutraveltracker.Claim currentClaim = iterator.next();
        int id = currentClaim.getId();
        clc.deleteClaim(id);
        iterator.remove();
    } 
}