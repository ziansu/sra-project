private ddf.minim.AudioPlayer player() {
    if ((musicList.size()) == 0) {
        throw new java.lang.IllegalStateException("y u no hev songs in folder");
    }
    return musicList.get(pos).player();
}