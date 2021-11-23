public static boolean sizeChecking(long size_msg, long size_wav_data) {
    int portion = 16;
    boolean re = false;
    if (((size_msg + 4) * portion) <= size_wav_data) {
        re = true;
    }
    return re;
}