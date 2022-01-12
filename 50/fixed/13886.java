private int getAdapterAndPlaceHolderCount() {
    return ((int) ((java.lang.Math.ceil(((1.0F * (mAdapter.getCount())) / (mNumColumns)))) * (mNumColumns)));
}