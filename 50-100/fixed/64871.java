public static int preciseCodePoint(org.jcodings.Encoding enc, byte[] bytes, int p, int end) {
    int l = org.jruby.util.StringSupport.preciseLength(enc, bytes, p, end);
    if (l > 0)
        return enc.mbcToCode(bytes, p, end);
    
    return -1;
}