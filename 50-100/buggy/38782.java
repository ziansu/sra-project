@org.junit.Test
public void emptyRefDirectoryDeleted() throws java.lang.Exception {
    java.lang.String ref = "dir/ref";
    tr.branch(ref).commit().create();
    java.lang.String name = repo.findRef(ref).getName();
    java.nio.file.Path dir = repo.getDirectory().toPath().resolve(name).getParent();
    gc.packRefs();
    org.junit.Assert.assertFalse(java.nio.file.Files.exists(dir));
}