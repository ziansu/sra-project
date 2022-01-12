@java.lang.Override
public boolean onKeyDown(int keyCode, @android.support.annotation.NonNull
android.view.KeyEvent event) {
    if (mVolumePage) {
        switch (keyCode) {
            case android.view.KeyEvent.KEYCODE_VOLUME_DOWN :
                java.lang.String a = null;
                a.length();
                mGalleryView.showNextPage();
                return true;
            case android.view.KeyEvent.KEYCODE_VOLUME_UP :
                mGalleryView.showPreviousPage();
                return true;
            default :
                return super.onKeyDown(keyCode, event);
        }
    }else {
        return super.onKeyDown(keyCode, event);
    }
}