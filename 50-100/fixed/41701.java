@java.lang.Override
public void onDistrictLoaded(java.util.List<com.zfwl.entity.Area> districts) {
    if (((mAddress) != null) && ((mAddress.getDistrict()) != null)) {
        mCurrentDistrict = mAddress.getDistrict();
    }else {
    }
    districtAdapter.setDatas(districts);
    if ((mCurrentDistrict) != null) {
        districtAdapter.setSelectArea(mCurrentDistrict.getId());
    }
    districtAdapter.notifyDataSetChanged();
}