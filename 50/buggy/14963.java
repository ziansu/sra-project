public void setRepeatModifier(final boolean repeat) {
    mRepeat = repeat;
    if (mMediaPlayerValid) {
        setLooping(repeat);
    }
}