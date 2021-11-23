@java.lang.Override
protected void onStart() {
    super.onStart();
    synchronized(szu.bdi.hybrid.demo.MainActivity._is_main_init) {
        if ((szu.bdi.hybrid.demo.MainActivity._is_main_init) == true)
            return ;
        
        szu.bdi.hybrid.demo.MainActivity._is_main_init = true;
    }
    android.util.Log.v(szu.bdi.hybrid.demo.MainActivity.LOGTAG, ".onStart()");
    fwdToMain();
}