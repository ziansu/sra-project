public void reloadData() {
    mDeploymentList = com.tortel.deploytrack.DatabaseManager.getInstance(mContext).getAllDeployments();
    mFragmentList.clear();
    this.notifyDataSetChanged();
}