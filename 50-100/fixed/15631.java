@java.lang.Override
public void adjustArcByCurrentTime(javafx.scene.shape.Arc arc) {
    java.time.LocalTime time = java.time.LocalTime.now();
    int milliSecond = (time.getNano()) / 1000000;
    int second = time.getSecond();
    double length = (-6.0) * second;
    arc.setLength(length);
}