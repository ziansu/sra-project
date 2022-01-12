@java.lang.Override
public void onDistrictLoaded(java.util.List<com.zfwl.entity.Area> districts) {
    if (((mAddress) != null) && ((mAddress.getDistrict()) != null)) {
        mCurrentDistrict = mAddress.getDistrict();
    }else {
        mCurrentDistrict = mSelectAreaPresenter.getDistrictWithIndex(0);
    }
    districtAdapter.setDatas(districts);
    districtAdapter.setSelectArea(mCurrentDistrict.getId());
    districtAdapter.notifyDataSetChanged();
}