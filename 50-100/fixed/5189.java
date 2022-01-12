@org.robolectric.annotation.Implementation
public void setScale(float sx, float sy, float px, float py) {
    setOps.put(org.robolectric.shadows.ShadowMatrix.SCALE, ((((((sx + " ") + sy) + " ") + px) + " ") + py));
}