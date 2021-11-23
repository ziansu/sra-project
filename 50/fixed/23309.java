@org.junit.Test
public void pass_null_check() {
    new com.google.common.testing.NullPointerTester().testStaticMethods(org.spine3.server.entity.storage.Columns.class, NullPointerTester.Visibility.PACKAGE);
}