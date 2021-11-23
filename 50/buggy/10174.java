public boolean accept(java.io.File pathname) {
    if (pathname.getPath().matches(this.filterRule)) {
        return true;
    }else {
        return false;
    }
}