@java.lang.Override
public void msgRecivedAlive(de.dmarcini.submatix.android4.full.comm.BtServiceMessage msg) {
    if (de.dmarcini.submatix.android4.full.ApplicationDEBUG.DEBUG) {
        android.util.Log.d(de.dmarcini.submatix.android4.full.gui.SPX42PreferencesFragment.TAG, (("SPX Alive <" + (msg.getContainer())) + "> recived"));
    }
    theToast.dismissDial();
}