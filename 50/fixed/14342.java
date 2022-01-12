@java.lang.Override
public int getTime() {
    if ((nativeVideo) != null) {
        return nativeVideo.getCurrentPosition();
    }
    return -1;
}