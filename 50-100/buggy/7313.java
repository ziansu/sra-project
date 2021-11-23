public ch.puzzle.itc.mobiliar.business.resourcegroup.control.CopyResourceResult doCopyResource(java.lang.Integer targetResourceId, java.lang.Integer originResourceId, ch.puzzle.itc.mobiliar.business.foreignable.entity.ForeignableOwner actingOwner) throws ch.puzzle.itc.mobiliar.business.foreignable.entity.ForeignableOwnerViolationException, ch.puzzle.itc.mobiliar.common.exception.AMWException {
    ch.puzzle.itc.mobiliar.business.resourcegroup.entity.ResourceEntity targetResource = commonDomainService.getResourceEntityById(targetResourceId);
    ch.puzzle.itc.mobiliar.business.resourcegroup.entity.ResourceEntity originResource = commonDomainService.getResourceEntityById(originResourceId);
    if (!(permissionBoundary.canCopyFromSpecificResource(originResource, originResource.getResourceGroup()))) {
        throw new ch.puzzle.itc.mobiliar.common.exception.NotAuthorizedException("Permission Denied");
    }
    return copyResourceDomainService.copyFromOriginToTargetResource(originResource, targetResource, actingOwner);
}