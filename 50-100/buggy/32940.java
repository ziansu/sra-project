@org.junit.Test
public void testInteract_withFrameBrick() {
    ge.edu.freeuni.sdp.arkanoid.model.Size size = mock(ge.edu.freeuni.sdp.arkanoid.model.Size.class);
    ge.edu.freeuni.sdp.arkanoid.model.Point originPoint = new ge.edu.freeuni.sdp.arkanoid.model.Point(0, 0);
    ge.edu.freeuni.sdp.arkanoid.model.FrameBrick frameBrick = new ge.edu.freeuni.sdp.arkanoid.model.FrameBrick(originPoint, size);
    ge.edu.freeuni.sdp.arkanoid.model.Paddle target = new ge.edu.freeuni.sdp.arkanoid.model.StickyPaddle(paddle, originPoint);
    target.interact(frameBrick);
    org.junit.Assert.assertThat(target.getPosition(), org.hamcrest.core.Is.is(org.hamcrest.core.IsEqual.equalTo(originPoint)));
}