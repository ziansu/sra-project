public static java.math.BigDecimal genericHeight(us.dot.its.jpo.ode.j2735.dsrc.VehicleHeight height) {
    if (((height.intValue()) < 0) || ((height.intValue()) > 127)) {
        throw new java.lang.IllegalArgumentException("Vehicle height out of bounds");
    }
    return java.math.BigDecimal.valueOf(((height.intValue()) * 5), 2);
}