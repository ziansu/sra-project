private void setImageViewMonsterImage() {
    int tier = ((int) (gemstone.gemster.Common.getPrefData(mContext, Common.MAIN_TIER)));
    android.content.res.TypedArray arrImg = mContext.getResources().obtainTypedArray(R.array.array_evol_image);
    int id = arrImg.getResourceId(tier, 0);
    mImageButtonMonster.setImageResource(id);
}