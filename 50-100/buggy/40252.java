@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (android.R.id.home)) {
        com.notalenthack.blaster.CommandActivity.mSerialService.sendCommand(Constants.SERIAL_CMD_CLOSE, "");
        com.notalenthack.blaster.CommandActivity.mSerialService.stop();
        finish();
    }else
        if ((item.getItemId()) == (R.id.menu_add_command)) {
            com.notalenthack.blaster.Command cmd = new com.notalenthack.blaster.Command();
            editCommand(cmd);
        }
    
    return super.onOptionsItemSelected(item);
}