@java.lang.Override
public void onClick(android.view.View view, int i) {
    java.lang.String city_selected;
    if (i == 0) {
        city_selected = mCurrentCity;
    }else {
        city_selected = mCities.get((i - 1));
    }
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("city", city_selected);
    android.content.Intent backIntent = new android.content.Intent();
    backIntent.putExtras(bundle);
    setResult(com.qhiehome.ihome.activity.RESULT_OK, backIntent);
    finish();
}