@java.lang.Override
public void decodeAFP(byte[] sfData, int offset, int length, com.mgz.afp.parser.AFPParserConfiguration config) throws com.mgz.afp.exceptions.AFPParserException {
    this.length = com.mgz.util.UtilBinaryDecoding.parseShort(sfData, offset, 1);
    this.tripletID = com.mgz.afp.triplets.Triplet.TripletID.valueOf(com.mgz.util.UtilBinaryDecoding.parseShort(sfData, (offset + 1), 1));
}