@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    int read_byte_num = 1;
    byte[] new_brightness = new byte[read_byte_num];
    new_brightness[0] = ((byte) (seekBar.getProgress()));
    com.liwn.zzl.markbit.FileIO.setBytes(MarkBitApplication.i_file, FileIO.BRIGHTNESS_ADDR, read_byte_num, new_brightness);
    com.liwn.zzl.markbit.FileIO.setBytes(MarkBitApplication.r_file, FileIO.BRIGHTNESS_ADDR, read_byte_num, new_brightness);
    MarkBitApplication.i_synced = false;
    MarkBitApplication.r_synced = false;
    mListener.updateNotification(MarkBitApplication.i_synced, MarkBitApplication.r_synced);
}