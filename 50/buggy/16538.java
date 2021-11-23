public void remove(int position) {
    mCityLab.delete(mDataset.get((position - 1)));
    mDataset = mCityLab.getCities();
    notifyItemRemoved(position);
}