@java.lang.Override
public void update() {
    intersectionPoints = calculateIntersections();
    if (intersectionPoints.isEmpty()) {
        if (((java.lang.System.currentTimeMillis()) - (timer)) >= (MAX_INTERVAL)) {
            marañaLineal();
            timer = java.lang.System.currentTimeMillis();
        }
    }
}