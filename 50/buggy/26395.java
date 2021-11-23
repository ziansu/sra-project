public void normalizeMantissa() {
    mantissa = converter.DPDToPackedBCD(mantissa);
    mantissa = (significand) + (mantissa);
    java.lang.System.out.println(mantissa);
    mantissa = converter.packedBCDToDecimal(mantissa);
}