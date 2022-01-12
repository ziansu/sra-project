@java.lang.Override
public void receive(org.tal.redstonechips.util.BitSet7 bits) {
    if (hasDebuggers())
        debug(("Received " + (org.tal.redstonechips.util.BitSetUtils.bitSetToBinaryString(bits, 0, outputs.length))));
    
    this.sendBitSet(dataPin, ((outputs.length) - (dataPin)), bits);
    if ((outputs.length) > 1) {
        this.sendOutput(0, true);
        this.sendOutput(0, false);
    }
}