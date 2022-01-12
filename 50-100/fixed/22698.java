@java.lang.Override
protected boolean isReadyPull(float diffx, float diffy) {
    int y = ((int) (com.nineoldandroids.view.ViewHelper.getTranslationY(mainView)));
    boolean ret = (((y <= (-(originMainRect.top))) && (diffy > 0)) && ((mainView.getScrollY()) <= 0)) || (y > (-(originMainRect.top)));
    android.util.Log.d("isReadyPull", ((("diffy=" + diffy) + ", ret=") + ret));
    return ret;
}