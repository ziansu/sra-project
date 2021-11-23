@java.lang.Override
public void categoryChanged(int activePosition) {
    categoriesManager.onCategoryChanged(activePosition);
    categoryAdapter.setSelected(activePosition);
    showNextCategoryText();
}