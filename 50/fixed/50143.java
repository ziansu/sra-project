@java.lang.Override
public void onProgressChanged(int progress) {
    short bassStrength = (progress == 0) ? 0 : ((short) ((((float) (1000)) / 19) * progress));
    com.rks.musicx.data.Eq.BassBoosts.setBassBoostStrength(bassStrength);
}