@org.springframework.transaction.annotation.Transactional
@org.springframework.security.access.prepost.PreAuthorize(value = (org.apache.kylin.rest.constant.Constant.ACCESS_HAS_ROLE_ADMIN) + " or hasPermission(#ae, 'ADMINISTRATION')")
public void clean(org.apache.kylin.common.persistence.AclEntity ae, boolean deleteChildren) {
    org.springframework.util.Assert.notNull(ae, "Acl domain object required");
    if ((ae.getId()) == null)
        return ;
    
    org.springframework.security.acls.model.ObjectIdentity objectIdentity = new org.springframework.security.acls.domain.ObjectIdentityImpl(ae.getClass(), ae.getId());
    try {
        aclService.deleteAcl(objectIdentity, deleteChildren);
    } catch (org.springframework.security.acls.model.NotFoundException e) {
    }
}