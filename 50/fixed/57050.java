public void setData(com.changkong.model.entities.IssueBean bean) {
    if (bean == null)
        return ;
    
    this.mData = bean;
    mAdapter.setData(mData.getPics());
}