public java.util.List<de.mirkosertic.bytecoder.core.BytecodeProgramJumps.Range> endRangesAt(de.mirkosertic.bytecoder.core.BytecodeOpcodeAddress aAddress) {
    java.util.List<de.mirkosertic.bytecoder.core.BytecodeProgramJumps.Range> theResult = new java.util.ArrayList<>();
    for (de.mirkosertic.bytecoder.core.BytecodeProgramJumps.Range theRange : ranges) {
        if (theRange.end.equals(aAddress)) {
            theResult.add(theRange);
        }
    }
    java.util.Collections.sort(theResult, ( o2, o1) -> java.lang.Integer.compare(o2.start.getAddress(), o1.start.getAddress()));
    return theResult;
}