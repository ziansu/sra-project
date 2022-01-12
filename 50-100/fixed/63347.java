public int silentGiveMan10Score(java.lang.String name, java.util.UUID uuid, java.lang.String nameTo, java.util.UUID uuidTo, long value, java.lang.String reason) {
    if (value == 0L) {
        return 1;
    }
    if (value < 0L) {
        return 2;
    }
    createMan10Score(name, uuid, nameTo, uuidTo, value, reason, "Give");
    return 0;
}