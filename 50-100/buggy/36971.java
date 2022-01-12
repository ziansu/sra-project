public cc.recommenders.io.Directory getParentDirectory(java.lang.String absoluteFileName) {
    java.io.File file = new java.io.File(absoluteFileName);
    cc.recommenders.assertions.Asserts.assertTrue(file.isAbsolute());
    java.lang.String parent = file.getParent();
    if (parent == null) {
        return new cc.recommenders.io.Directory("/");
    }else {
        return new cc.recommenders.io.Directory(parent);
    }
}