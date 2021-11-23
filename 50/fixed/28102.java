@java.lang.Override
public int getItemCount() {
    int y = informationCategoryList.size();
    return y - (y / 3);
}