public static double byteListToDouble19(org.jruby.util.ByteList bytes, boolean strict) {
    return new org.jruby.util.ConvertDouble.DoubleConverter().parse(bytes, strict);
}