@java.lang.Override
public int getItemCount() {
    if ((mRecipes) == null) {
        return 0;
    }
    return mRecipes.size();
}