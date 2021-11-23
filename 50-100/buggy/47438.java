private void saveList() {
    java.util.ArrayList<dragon.tamu.playphrase.Category> temp = new java.util.ArrayList<>();
    for (int i = 0; i < (mCategoryList.size()); i++) {
        temp.add(((dragon.tamu.playphrase.Category) (mCategoryList.get(i))));
    }
    fileSystem.saveInfoToFile(temp);
}