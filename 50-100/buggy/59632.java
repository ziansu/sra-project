public void writeObjectBeginPush(int lengthLength) {
    this.complexFieldStack[((this.complexFieldStackIndex)++)] = this.destIndex;
    this.dest[((this.destIndex)++)] = ((byte) (255 & (((com.nanosai.gridops.ion.IonFieldTypes.OBJECT) << 4) | lengthLength)));
    this.destIndex += lengthLength;
}