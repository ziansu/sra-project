public void updateTags() {
    java.util.ArrayList<com.CMPUT301W15T02.teamtoapp.Model.Tag> userTags = getTags();
    com.CMPUT301W15T02.teamtoapp.Controllers.ClaimListController claimListController = new com.CMPUT301W15T02.teamtoapp.Controllers.ClaimListController();
    java.util.ArrayList<com.CMPUT301W15T02.teamtoapp.Model.Claim> claims = claimListController.getClaims();
    for (com.CMPUT301W15T02.teamtoapp.Model.Claim claim : claims) {
        java.util.ArrayList<com.CMPUT301W15T02.teamtoapp.Model.Tag> newTags = new java.util.ArrayList<com.CMPUT301W15T02.teamtoapp.Model.Tag>();
        for (com.CMPUT301W15T02.teamtoapp.Model.Tag tag : claim.getTags()) {
            if (userTags.contains(tag)) {
                newTags.add(tag);
            }
        }
        claim.setTags(newTags);
    }
}