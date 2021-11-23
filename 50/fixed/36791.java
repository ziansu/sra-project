@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    if (((mContext) instanceof com.nerdzlab.mysound.Adapters.SoundInterface) && b) {
        ((com.nerdzlab.mysound.Adapters.SoundInterface) (mContext)).soundLevelChanged(item.getResource_id(), i);
    }
}