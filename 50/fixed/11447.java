public org.usfirst.frc.team1699.utils.inireader.ConfigLine<?> getLine(int index) {
    try {
        return new org.usfirst.frc.team1699.utils.inireader.ConfigLine(this.lines.get(index));
    } catch (java.lang.IndexOutOfBoundsException e) {
        return null;
    }
}