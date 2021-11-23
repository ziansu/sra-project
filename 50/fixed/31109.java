@org.junit.Test
public void isGpsInfoOld_when_newMount_then_true() {
    com.bobs.mount.Mount mount = new com.bobs.mount.Mount();
    assertTrue(mount.isGpsInfoOld());
}