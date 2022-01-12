@java.lang.Override
public void smooth(int quality) {
    this.quality = quality;
    if (quality == 0) {
        noSmooth();
    }else {
        smooth();
    }
}