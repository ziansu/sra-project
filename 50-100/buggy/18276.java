@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    int read_byte_num = 1;
    byte[] all_samples = new byte[read_byte_num];
    all_samples[0] = ((byte) (seekBar.getProgress()));
    com.liwn.zzl.markbit.FileIO.setBytes(MarkBitApplication.i_file, FileIO.ALL_SAMPLE_NUM_ADDR, read_byte_num, all_samples);
    com.liwn.zzl.markbit.FileIO.setBytes(MarkBitApplication.r_file, FileIO.ALL_SAMPLE_NUM_ADDR, read_byte_num, all_samples);
    MarkBitApplication.i_synced = false;
    MarkBitApplication.r_synced = false;
    mListener.updateNotification(MarkBitApplication.i_synced, MarkBitApplication.r_synced);
    mListener.updateAllMark(seekBar.getProgress());
}