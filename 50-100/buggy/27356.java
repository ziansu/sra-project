void jpegcompress() {
    rgbtoyuv(picarray, picarray.length);
    process = new Processbar(rgbarray.showfr.getX(), rgbarray.showfr.getY());
    fullDCT(YCbCrarray);
    fullVQ();
    RLC();
    DPCM();
    output();
    fullRVQ();
    fullIDCT(dctarray);
    yuvtorgb(idctarray, picarray.length);
}