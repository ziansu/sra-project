@java.lang.Override
public boolean handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case br.com.carlosrafaelgn.fplay.ActivitySettings.MSG_REFRESH_BLUETOOTH :
            refreshBluetoothStatus(true);
            break;
        case br.com.carlosrafaelgn.fplay.ActivitySettings.MSG_SAVE_CONFIG :
            if ((br.com.carlosrafaelgn.fplay.playback.Player.state) < (br.com.carlosrafaelgn.fplay.playback.Player.STATE_TERMINATING))
                br.com.carlosrafaelgn.fplay.playback.Player.saveConfig(false);
            
            break;
    }
    return true;
}