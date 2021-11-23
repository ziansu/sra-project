private void removeSelectedTag() {
    mFlowLayout.removeView(lastSelectTagView);
    int size = mTagList.size();
    java.lang.String delTagContent = lastSelectTagView.getText().toString();
    for (int i = 0; i < size; i++) {
        if (delTagContent.equals(mTagList.get(i))) {
            mTagList.remove(i);
            break;
        }
    }
    lastSelectTagView = null;
    isDelAction = false;
}