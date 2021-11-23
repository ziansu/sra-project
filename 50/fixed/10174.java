public boolean accept(java.io.File pathname) {
    if (pathname.getName().matches(this.filterRule)) {
        return true;
    }else {
        return false;
    }
}