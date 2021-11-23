public static int get_field_extended_count(int ext_hdr) {
    if ((ext_hdr >>> 15) == 0) {
        int val = ext_hdr & 511;
        return val;
    }else {
        return 0;
    }
}