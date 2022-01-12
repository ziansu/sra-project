@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            {
                try {
                    bluetoothSocket.close();
                    com.example.haresh.tic_tac_toe_app.CanvasViewDouble2P.connectedThread.stop();
                } catch (java.lang.Exception e) {
                    android.util.Log.d(TAG, ("exception " + (e.getMessage())));
                }
                TwoDevice2P.act_2p.finish();
            }
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
    }
}