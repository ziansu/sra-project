public void volumeDown() {
    if ((currentVolume) > ((-0.01) + (hw1.Television.VOLUME_INCREMENT))) {
        currentVolume = ((currentVolume) - (hw1.Television.VOLUME_INCREMENT)) + 1.0E-15;
    }else {
        currentVolume = 0;
    }
}