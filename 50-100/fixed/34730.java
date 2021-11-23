public static double activeSlope() {
    com.eveningoutpost.dexdrip.Models.BgReading bgReading = com.eveningoutpost.dexdrip.Models.BgReading.lastNoSenssor();
    if (bgReading != null) {
        double slope = ((2 * (bgReading.a)) * ((new java.util.Date().getTime()) + (com.eveningoutpost.dexdrip.Models.BgReading.BESTOFFSET))) + (bgReading.b);
        android.util.Log.w(com.eveningoutpost.dexdrip.Models.BgReading.TAG, ("ESTIMATE SLOPE" + slope));
        return slope;
    }
    return 0;
}