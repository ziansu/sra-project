@java.lang.Override
public void dataReset() {
    double distanceX = (centerCoodinate.x) - (pencilCoodinate.x);
    double distanceY = (centerCoodinate.y) - (pencilCoodinate.y);
    pencilDistance = java.lang.Math.sqrt(((distanceX * distanceX) + (distanceY * distanceY)));
    previousPencilDistance = pencilDistance;
    return ;
}