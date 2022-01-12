@java.lang.Override
public void onTick(long millisUntilFinished) {
    if ((mCallsFinished) == 2) {
        mPagerCitiesAdapter.addCity(mCity);
        mPagerCitiesAdapter.notifyDataSetChanged();
        ar.com.ivanfenoy.climaargentina.Controllers.SharedPreferencesController.saveCity(this, mCity);
        mCity = null;
        mCallsFinished = 0;
        this.cancel();
    }
}