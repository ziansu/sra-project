@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((o instanceof com.searchcode.app.model.RepoResult) == false) {
        return false;
    }
    com.searchcode.app.model.RepoResult rr = ((com.searchcode.app.model.RepoResult) (o));
    if (this.getName().equals(rr.getName())) {
        return true;
    }
    return false;
}