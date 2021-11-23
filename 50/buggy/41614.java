@java.lang.Override
public void rotate(float degrees) {
    boundingBox.transform(org.newdawn.slick.geom.Transform.createRotateTransform(degrees));
    barrel.transform(org.newdawn.slick.geom.Transform.createRotateTransform((degrees + 90)));
}