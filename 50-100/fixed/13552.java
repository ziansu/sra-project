@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    int read_byte_num = 1;
    byte[] type = new byte[read_byte_num];
    type[0] = ((byte) (position));
    com.liwn.zzl.markbit.FileIO.setBytes(MarkBitApplication.i_file, FileIO.BATTERY_TYPE_ADDR, read_byte_num, type);
    MarkBitApplication.i_synced = false;
    mListener.updateNotification(MarkBitApplication.i_synced, MarkBitApplication.r_synced);
}