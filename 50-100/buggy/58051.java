public static java.lang.String format(long ms) {
    java.lang.String day = "";
    if (ms > (rinde.sim.util.TimeFormatter.DAY)) {
        day = (java.lang.Math.round((ms / (rinde.sim.util.TimeFormatter.DAY)))) + " ";
    }
    java.lang.String sign = (ms < 0) ? "-" : "";
    return (sign + day) + (rinde.sim.util.TimeFormatter.dateFormat.format(new java.util.Date(java.lang.Math.abs(ms))));
}