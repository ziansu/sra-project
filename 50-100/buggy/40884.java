public void updateIP(org.opencv.core.Mat im) {
    interestPoints = new float[32];
    for (int i = 0; i < 24; i++) {
        for (int j = 0; j < 480; j++) {
            double val = im.get(j, (i * (xdist)))[0];
            if (val == 0.0) {
                interestPoints[i] = j;
                break;
            }
        }
    }
}