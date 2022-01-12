public void testCanDeleteClaim() {
    java.lang.String name = "test";
    java.util.Date sDate = new java.util.Date(123);
    java.util.Date eDate = new java.util.Date(456);
    ca.ualberta.cs.scandaloutraveltracker.Claim newClaim = new ca.ualberta.cs.scandaloutraveltracker.Claim(name, sDate, eDate);
    newClaim.setCanEdit(true);
    ca.ualberta.cs.scandaloutraveltracker.ClaimList claimsList = ca.ualberta.cs.scandaloutraveltracker.ClaimList.getClaimList();
    claimsList.addClaim(newClaim);
    claimsList.deleteClaim(0);
    assertEquals("Count should be zero", claimsList.getCount(), 0);
}