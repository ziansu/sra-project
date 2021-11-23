public static java.lang.String houseValueToText(int hV) {
    if ((hV >= 1) || (hV <= 16)) {
        return jmri.jmrix.powerline.X10Sequence.houseValueDecoder[hV];
    }else {
        return "??";
    }
}