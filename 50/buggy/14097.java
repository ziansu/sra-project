@org.junit.Test
public void testInitiallyNoLibrariesSelected() {
    syncExec(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            org.junit.Assert.assertTrue(getSelectedLibrariesSorted().isEmpty());
        }
    });
}