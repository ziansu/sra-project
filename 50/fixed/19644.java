public boolean[] opCodeMask() {
    return ch.hszt.kfh.compost.operations.Operation.stringToInstrBitArray(opCodeString(), 'x', true);
}