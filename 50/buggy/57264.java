public void ActivateEmptyTextView() {
    if (drinks.isEmpty())
        emptyView.setVisibility(View.VISIBLE);
    else
        emptyView.setVisibility(View.INVISIBLE);
    
}