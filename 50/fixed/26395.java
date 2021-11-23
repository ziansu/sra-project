public void normalizeMantissa() {
    mantissa = converter.DPDToPackedBCD(mantissa);
    mantissa = (significand) + (mantissa);
    mantissa = converter.packedBCDToDecimal(mantissa);
}