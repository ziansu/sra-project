public void setMoomintrollsCollection(trolls.MoomintrollsCollection moomintrollsCollection) {
    this.moomintrollsCollection = moomintrollsCollection;
    moomintrollsDataModel.clear();
    for (trolls.Moomintroll moomintroll : moomintrollsCollection) {
        moomintrollsDataModel.addRow(moomintroll);
    }
    reloadTree();
}