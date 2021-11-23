public org.backmeup.index.sharing.policy.SharingPolicy createAndAddSharingPolicy(org.backmeup.index.model.User owner, org.backmeup.index.model.User sharingWith, org.backmeup.index.sharing.policy.SharingPolicies policy, java.lang.String sharedElementID) {
    org.backmeup.index.sharing.policy.SharingPolicy shPol = createAndAddSharingPolicy(owner, sharingWith, policy);
    shPol.setSharedElementID(sharedElementID);
    return addSharingPolicy(shPol);
}