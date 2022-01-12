@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.ibtnClose :
            windowManager.removeView(linearLayout);
            stopSelf();
            break;
    }
}