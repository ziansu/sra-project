@java.lang.Override
public void onBackPressed() {
    com.ahgpoug.timetabletest3.DataBaseIO.writeCfg();
    finish();
    return ;
}