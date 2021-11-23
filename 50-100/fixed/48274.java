public void msgRecivedSerial(de.dmarcini.submatix.android4.full.comm.BtServiceMessage msg) {
    if (de.dmarcini.submatix.android4.full.ApplicationDEBUG.DEBUG) {
        android.util.Log.d(de.dmarcini.submatix.android4.full.gui.MainActivity.TAG, (("serial <" + (msg.getContainer())) + "> recived"));
    }
    de.dmarcini.submatix.android4.full.gui.MainActivity.spxConfig.setSerial(new java.lang.String(((java.lang.String) (msg.getContainer()))));
}