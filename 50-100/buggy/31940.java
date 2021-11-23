@java.lang.Override
public void headerScrollChanged(float scrollDistance) {
    float friction = scrollDistance / (heightOfHeader);
    float alphaFriction = (heightOfHeader) / scrollDistance;
    scaleView(friction, friction, cover, fadeCover);
    setAlpha(alphaFriction, fadeCover);
    setTranslate(0, ((scrollDistance - (heightOfHeader)) / 2), cover, fadeCover);
}