@org.junit.Test
public void isDeleteTimeSet_ShouldReturn_True() throws java.lang.Exception {
    this.configuration.setDeleteTime(5);
    assertTrue(this.configuration.isDeleteTimeSet());
}