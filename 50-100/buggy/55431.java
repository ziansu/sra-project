public java.util.BitSet[] doBBDT() {
    for (int i = 0; i < (widthBox); i++)
        for (int j = 0; j < (heightBox); j++) {
            short[] conditions = getBoxConditions(i, j);
            doAction(i, j, conditions);
        }
    
    collectLabels();
    collectBitBox();
    translateBitBox();
    return bitComponents.clone();
}