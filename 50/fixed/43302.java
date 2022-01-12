private hudson.plugins.claim.ClaimBuildAction givenBuildClaimedByOtherUser() {
    hudson.plugins.claim.ClaimBuildAction action = build.getAction(hudson.plugins.claim.ClaimBuildAction.class);
    action.claim("user2", "reason", "user1", true, false);
    return action;
}