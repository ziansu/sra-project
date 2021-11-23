public void clearActiveBook() {
    if ((mActiveBook) == null)
        return ;
    
    android.widget.ImageView exitIcon = ((android.widget.ImageView) (mActiveBook.findViewById(R.id.exitViewIcon)));
    android.widget.ImageView editIcon = ((android.widget.ImageView) (mActiveBook.findViewById(R.id.editViewIcon)));
    if ((exitIcon != null) && (editIcon != null)) {
        exitIcon.setVisibility(View.GONE);
        editIcon.setVisibility(View.GONE);
    }
}