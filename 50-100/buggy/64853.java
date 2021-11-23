@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, java.lang.String rawJsonResponse, me.itangqi.buildingblocks.model.DailyNewsResult response) {
    if ((response.stories) != null) {
        for (me.itangqi.buildingblocks.model.DailyNews item : response.stories) {
            mNewsList.add(item);
            com.orhanobut.logger.Logger.d(item.title);
        }
        mAdapter.notifyDataSetChanged();
    }
}