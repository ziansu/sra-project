@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((intent.getAction().equals(Intent.ACTION_HEADSET_PLUG)) && (!(isInitialStickyBroadcast()))) {
        int state = intent.getIntExtra("state", (-1));
        switch (state) {
            case 0 :
                player.pause();
                break;
            case 1 :
                break;
        }
    }
}