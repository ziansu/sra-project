public static int get_field_extended_count(int ext_hdr) {
    return ext_hdr & 511;
}