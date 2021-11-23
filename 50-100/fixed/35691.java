private imp.data.MelodyPart expandBy(imp.data.MelodyPart melody, int length, int num) {
    int newLength = length * num;
    imp.data.MelodyPart adjustedMelody = melody.copy();
    adjustedMelody.setSize(newLength);
    cm.execute(new imp.com.TimeWarpCommand(adjustedMelody, 0, newLength, true, num, 1));
    return adjustedMelody;
}