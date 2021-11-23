@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    switch (checkedId) {
        case R.id.nodown :
            mDownIntercept = 0;
            break;
        case R.id.vgdown1 :
            mDownIntercept = 1;
            break;
        case R.id.vgdown2 :
            mDownIntercept = 2;
            break;
        case R.id.vdown :
            mDownIntercept = 3;
            break;
    }
    android.util.Log.d(ray.cyberpup.com.touchframework.InterceptsDialog.LOG_TAG, ("mDownIntercept checked changed: " + (mDownIntercept)));
}