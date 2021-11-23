private void setCheckedNoiseType(@android.support.annotation.RawRes
int soundFile) {
    switch (soundFile) {
        case R.raw.brown :
            noiseTypeBrown.setChecked(true);
            break;
        case R.raw.pink :
            noiseTypePink.setChecked(true);
            break;
        default :
            noiseTypeWhite.setChecked(true);
            break;
    }
}