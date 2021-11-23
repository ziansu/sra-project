public static void assertEquals(java.lang.String message, java.lang.Object expected, java.lang.Object actual) {
    boolean condition;
    if (expected == null) {
        condition = actual == null;
    }else {
        condition = expected.equals(actual);
    }
    com.triangleleft.assertdialog.AssertDialog.assertTrue(message, condition);
}