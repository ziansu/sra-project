public void setPixel(int h, int w, int[] channels) {
    assert (channels.length) == (PixelBlock.N_CHANNELS);
    channel1[h][w] = channels[0];
    channel2[h][w] = channels[1];
    channel3[h][w] = channels[2];
}