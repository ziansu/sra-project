public boolean more_rbsp_data() {
    if ((pointer) == (((bytestream.length) - 1) * 8)) {
        return false;
    }else
        if ((pointer) >= (trailingBitOffSet)) {
            return false;
        }else {
            return true;
        }
    
}