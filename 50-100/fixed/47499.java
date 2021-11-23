private Point.Metrics point_metrics_of(dataTypes.UserDevicePair.RatioType type) {
    switch (type) {
        case PRESSURE :
            return Point.Metrics.PRESSURE;
        case DISTANCE :
            return Point.Metrics.DISTANCE;
        case TIME :
            return Point.Metrics.TIME;
        case VELOCiTY :
            return Point.Metrics.VELOCITY;
        case ACCELERATION :
            return Point.Metrics.ACCELERATION;
        case TIME_LENGTH :
            return Point.Metrics.ACCELERATION;
    }
    java.lang.System.out.println("shouldn't be here !!!!! UserDevicePair 450");
    return Point.Metrics.PRESSURE;
}