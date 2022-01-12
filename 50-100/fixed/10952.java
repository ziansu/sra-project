public static void assertEquals(java.lang.Object expected, java.lang.Object actual, java.lang.String message) {
    boolean condition;
    if (expected == null) {
        condition = actual == null;
    }else {
        condition = expected.equals(actual);
    }
    com.triangleleft.assertdialog.AssertDialog.assertTrue(condition, message);
}