@java.lang.Override
public java.lang.String tsNumPadInputValue(short beat, short value) {
    timeSignature.setBeats(beat);
    timeSignature.setNoteValues(value);
    timeSignatureText.setText(((("" + beat) + "/") + value));
    metroTask.setBeat(beat);
    metroTask.setNoteValue(value);
    return null;
}