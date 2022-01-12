@butterknife.OnClick(value = R.id.card_view)
void OnItemClicked() {
    if ((mCallback) != null) {
        mCallback.onCategoryClicked(category.getId());
        hexColorImageView.setImageResource(R.drawable.ic_category_selected);
        if ((currentSelectedImage) != null)
            currentSelectedImage.setImageResource(0);
        
        currentSelectedImage = hexColorImageView;
    }
}