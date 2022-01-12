public static void main(java.lang.String[] args) {
    try {
        org.python.pydev.editor.actions.PyScopeSelectionTest test = new org.python.pydev.editor.actions.PyScopeSelectionTest();
        test.setUp();
        test.testWithStructures();
        test.tearDown();
        junit.textui.TestRunner.run(org.python.pydev.editor.actions.PyScopeSelectionTest.class);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}