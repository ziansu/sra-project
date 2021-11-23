public java.util.List<com.dianping.codereview.svn.Resource> getChildren(com.dianping.codereview.svn.Resource dir) throws org.tmatesoft.svn.core.SVNException {
    return this.root.findChildren(dir);
}