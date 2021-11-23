private int av_clip_uint8(int a) {
    if ((a & (~255)) != 0)
        return (-a) >> 31;
    else
        return a;
    
}