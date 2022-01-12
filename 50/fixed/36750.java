@java.lang.Override
public void setCarrage(float distance) {
    carrage.rotateTo(((int) (distance * (mill.PhysicalMill.CARRAGE_RATIO))), true);
    carrageDistance = distance;
}