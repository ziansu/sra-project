@java.lang.Override
public us.ihmc.graphicsDescription.Graphics3DObject getLinkGraphics() {
    us.ihmc.graphicsDescription.Graphics3DObject linkGraphics = new us.ihmc.graphicsDescription.Graphics3DObject();
    linkGraphics.addCoordinateSystem(scale, arrowColor);
    return linkGraphics;
}