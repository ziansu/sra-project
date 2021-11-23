@java.lang.Override
public int compare(de.androidpit.colorthief.MMCQ.VBox a, de.androidpit.colorthief.MMCQ.VBox b) {
    int aCount = a.count(false);
    int bCount = b.count(false);
    int aVolume = a.volume(false);
    int bVolume = b.volume(false);
    if (aCount == bCount) {
        return aVolume - bVolume;
    }
    return java.lang.Long.compare((((long) (aCount)) * aVolume), (((long) (bCount)) * bVolume));
}