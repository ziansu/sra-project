private static boolean checkCompatible(Pair pair, RoomDayTime roomDayTime, java.util.ArrayList<java.lang.String> specialInstruments) {
    if (specialInstruments.contains(pair.getInstrument())) {
        if (!(roomDayTime.getRoom().getSpecialInstruments().contains(pair.getInstrument()))) {
            return false;
        }
    }
    if (!(pair.getMutualTimes().contains(roomDayTime.getTime()))) {
        return false;
    }
    return true;
}