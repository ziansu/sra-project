private hudson.plugins.claim.ClaimBuildAction givenBuildClaimedByCurrentUser() {
    hudson.plugins.claim.ClaimBuildAction action = build.getAction(hudson.plugins.claim.ClaimBuildAction.class);
    action.claim("user1", "reason", "user1", true);
    return action;
}