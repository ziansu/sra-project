@java.lang.Override
public void onScrollChange(android.support.v4.widget.NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
    if ((scrollY > oldScrollY) & (!(isImmersive))) {
        hideSystemUI(decorView);
    }else
        if ((scrollY < oldScrollY) & (isImmersive)) {
            showSystemUI(decorView);
        }
    
}