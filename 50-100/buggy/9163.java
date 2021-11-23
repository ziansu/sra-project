private void ancestorPathCheck(java.util.List<java.lang.String> ancestorPath, java.util.List<edu.unc.lib.dl.fedora.PID> pids) {
    for (int i = 0; i < (ancestorPath.size()); i++) {
        org.junit.Assert.assertTrue(ancestorPath.get(i).startsWith((((i + 1) + ",") + (pids.get(i).getId()))));
    }
}