protected void updateFromNameChange(java.lang.String newHeroName) {
    mName = newHeroName;
    java.lang.String imageName = mParentPresenter.getHeroImageName(newHeroName);
    for (int i = 0; i < (mSimilarityList.size()); i++) {
        if (mSimilarityList.get(i).equals(imageName)) {
            mView.setHeroInRecycler(i);
            break;
        }
    }
    mParentPresenter.hideKeyboard();
    mParentPresenter.sendUpdatedHeroList();
}