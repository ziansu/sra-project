@org.junit.Test
public void isDeleteTimeSet_ShouldReturn_True() throws java.lang.Exception {
    this.configuration.setDeleteTime(1);
    assertTrue(this.configuration.isDeleteTimeSet());
}