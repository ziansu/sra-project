public boolean more_rbsp_data() {
    if ((pointer) == (((bytestream.length) * 8) - 1)) {
        return false;
    }else
        if ((pointer) >= (trailingBitOffSet)) {
            return false;
        }else {
            return true;
        }
    
}