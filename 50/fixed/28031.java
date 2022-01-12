@com.youama.nexus.core.system.Test(expected = java.lang.NullPointerException.class)
public void testGetService() {
    singleService.getService(java.util.Objects.class);
}