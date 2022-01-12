@java.lang.Override
public void parentPath(java.lang.String path) {
    if ((this.path) != null)
        this.path = io.femo.http.HttpRoutable.joinPaths(path, this.path);
    
}