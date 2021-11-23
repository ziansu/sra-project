@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true)
public com.hypersocket.vfs.VirtualFile getVirtualFileByResource(java.lang.String virtualPath, com.hypersocket.realm.Realm realm, com.hypersocket.realm.Principal principal, com.hypersocket.fs.FileResource... resources) {
    return get(com.hypersocket.vfs.VirtualFile.class, new com.hypersocket.vfs.VirtualPathCriteria(virtualPath), new com.hypersocket.resource.RealmCriteria(realm), new com.hypersocket.vfs.FileResourceCriteria(resources), new com.hypersocket.vfs.PrincipalCriteria(principal), new com.hypersocket.vfs.ConflictCriteria());
}