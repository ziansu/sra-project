public java.util.List<com.dianping.codereview.svn.Resource> getChildren(com.dianping.codereview.svn.Resource dir) throws org.tmatesoft.svn.core.SVNException {
    if ((root) == null) {
        return null;
    }
    return this.root.findChildren(dir);
}