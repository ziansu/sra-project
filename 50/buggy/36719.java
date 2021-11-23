private void markDestructable(final org.apache.nifi.controller.repository.claim.ContentClaim contentClaim) {
    if (contentClaim == null) {
        return ;
    }
    final org.apache.nifi.controller.repository.claim.ResourceClaim resourceClaim = contentClaim.getResourceClaim();
    if (resourceClaim == null) {
        return ;
    }
    claimManager.markDestructable(resourceClaim);
}