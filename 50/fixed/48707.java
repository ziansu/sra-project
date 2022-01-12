public static void calculateTimes(com.utyf.pmetro.util.StationsNum start) {
    synchronized(com.utyf.pmetro.map.TRP.rt) {
        com.utyf.pmetro.map.TRP.rt.setStart(start);
    }
}