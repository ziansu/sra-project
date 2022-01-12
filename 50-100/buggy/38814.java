private static java.math.BigDecimal steeringAngle(us.dot.its.jpo.ode.j2735.dsrc.SteeringWheelAngle steeringWhealAngle) {
    java.math.BigDecimal angle = null;
    if ((steeringWhealAngle != null) && ((steeringWhealAngle.intValue()) != 127)) {
        angle = java.math.BigDecimal.valueOf(((steeringWhealAngle.intValue()) * 15), 1);
    }
    return angle;
}