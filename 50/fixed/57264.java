public void ActivateEmptyTextView() {
    if (((drinks) == null) || (drinks.isEmpty()))
        emptyView.setVisibility(View.VISIBLE);
    else
        emptyView.setVisibility(View.INVISIBLE);
    
}