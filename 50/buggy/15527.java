public void reloadData() {
    mDeploymentList = com.tortel.deploytrack.DatabaseManager.getInstance(mContext).getAllDeployments();
    this.notifyDataSetChanged();
    mFragmentList.clear();
}