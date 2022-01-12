@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.widget.Toast.makeText(this, "connected", Toast.LENGTH_LONG).show();
    if ((myMessageType) == (it.polimi.polidemonstrator.businesslogic.SendMessageServiceToHandheld.MyWear_HandheldMessageAPIType.SendThroughMessageAPI.ordinal())) {
        resolveNodeAndRequestForMsgSend();
    }else
        if ((myMessageType) == (it.polimi.polidemonstrator.businesslogic.SendMessageServiceToHandheld.MyWear_HandheldMessageAPIType.SendThroughDataAPI.ordinal())) {
            sendData();
        }
    
    stopSelf();
}