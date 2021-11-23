@org.junit.Test
public void testDropClass1() {
    this.student.registerForClass("James", "145", 2017);
    this.student.dropClass("James", "145", 2017);
    org.junit.Assert.assertFalse(this.student.isRegisteredFor("James", "145", 2017));
}