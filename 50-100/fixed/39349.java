public pl.edu.icm.jlargearrays.LogicLargeArray not() {
    pl.edu.icm.jlargearrays.LogicLargeArray out = new pl.edu.icm.jlargearrays.LogicLargeArray(length, false);
    for (long i = 0; i < (length); i++) {
        out.setByte(i, ((byte) (1 - (getByte(i)))));
    }
    return out;
}