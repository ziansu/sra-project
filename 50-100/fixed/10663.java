@java.lang.Override
public void onCityLoaded(java.util.List<com.zfwl.entity.Area> citys) {
    if (((mAddress) != null) && ((mAddress.getCity()) != null)) {
        mCurrentCity = mAddress.getCity();
        mSelectAreaPresenter.loadNextDistrict(mCurrentCity.getId());
    }else {
    }
    cityAdapter.setDatas(citys);
    if ((mCurrentCity) != null) {
        cityAdapter.setSelectArea(mCurrentCity.getId());
    }
    cityAdapter.notifyDataSetChanged();
}