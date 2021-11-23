@java.lang.Override
public void onResponse(@android.support.annotation.NonNull
retrofit2.Call<java.util.List<com.nanacorp.finn.entity.FinnPortfolioData>> call, @android.support.annotation.NonNull
retrofit2.Response<java.util.List<com.nanacorp.finn.entity.FinnPortfolioData>> response) {
    int statusCode = response.code();
    switch (statusCode) {
        case 200 :
            mChartData = response.body();
            if ((mFinnChartView) != null) {
                mFinnChartView.setChartData(mChartData);
            }
            break;
        default :
            break;
    }
}