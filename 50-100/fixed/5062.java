@java.lang.Override
public void onResponse(retrofit2.Call<com.ieeecsvit.riviera17android.models.PerEventResponse> call, retrofit2.Response<com.ieeecsvit.riviera17android.models.PerEventResponse> response) {
    realm.beginTransaction();
    realm.copyToRealmOrUpdate(response.body().event);
    realm.commitTransaction();
    mSectionsPagerAdapter = new com.ieeecsvit.riviera17android.activity.EventActivity.SectionsPagerAdapter(getSupportFragmentManager(), this, id);
    mViewPager.setAdapter(mSectionsPagerAdapter);
}