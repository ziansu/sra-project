private int getAdapterAndPlaceHolderCount() {
    final int adapterCount = ((int) ((java.lang.Math.ceil(((1.0F * (mAdapter.getCount())) / (mNumColumns)))) * (mNumColumns)));
    return adapterCount;
}