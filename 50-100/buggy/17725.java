public void setPixel(int h, int w, int[] channels) {
    assert (channels.length) == (PixelBlock.N_CHANNELS);
    channel1[w][h] = channels[0];
    channel2[w][h] = channels[1];
    channel3[w][h] = channels[2];
}