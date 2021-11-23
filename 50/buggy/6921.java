@java.lang.Override
public void onItemRangeInserted(int positionStart, int itemCount) {
    super.onItemRangeInserted(positionStart, itemCount);
    progressBar.setVisibility(View.GONE);
}