@org.junit.Test
public void testBeginMethod() throws java.lang.Exception {
    de.neusta.common.controller.AspectController aspectController = new de.neusta.common.controller.AspectController();
    aspectController.beginMethod(log, "myMethod");
    org.apache.log4j.Logger log = ((org.apache.log4j.Logger) (org.springframework.test.util.ReflectionTestUtils.getField(aspectController, "log")));
    org.junit.Assert.assertSame(log, this.log);
    long time = ((long) (org.springframework.test.util.ReflectionTestUtils.getField(aspectController, "time")));
}