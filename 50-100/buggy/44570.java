@org.junit.Test
public void testTranslation() {
    sut.setWorldBounds(irmb.test.util.TestUtil.makePoint(0, 25), irmb.test.util.TestUtil.makePoint(10, 0));
    sut.setViewBounds(irmb.test.util.TestUtil.makePoint(0, 5), irmb.test.util.TestUtil.makePoint(10, 30));
    irmb.flowsim.model.Point p = irmb.test.util.TestUtil.makePoint(0, 0);
    irmb.flowsim.model.Point result = sut.transformToPointOnScreen(p);
    irmb.test.util.TestUtil.assertExpectedPointEqualsActual(irmb.test.util.TestUtil.makePoint(0, 30), result, 1);
}