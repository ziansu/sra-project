@org.junit.Test
public void testWarpHorizontallyRightToLeft() {
    nl.tudelft.scrumbledore.LevelElement el = new nl.tudelft.scrumbledore.Fruit(new nl.tudelft.scrumbledore.Vector(0, 0), new nl.tudelft.scrumbledore.Vector(32, 32));
    el.getPosition().setX(((Constants.LEVELX) + 17));
    kinetics.warpHorizontally(el);
    org.junit.Assert.assertEquals((-16), el.posX(), Constants.DOUBLE_PRECISION);
    org.junit.Assert.assertEquals(0, el.posY(), Constants.DOUBLE_PRECISION);
}