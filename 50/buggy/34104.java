public void setMoomintrollsCollection(trolls.MoomintrollsCollection moomintrollsCollection) {
    clear();
    this.moomintrollsCollection = moomintrollsCollection;
    for (trolls.Moomintroll moomintroll : moomintrollsCollection) {
        moomintrollsDataModel.addRow(moomintroll);
    }
    reloadTree();
}