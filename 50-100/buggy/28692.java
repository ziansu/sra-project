private void setImage(android.widget.ImageView view, org.bbqapp.android.view.MenuAdapter.Text entry) {
    view.setImageResource(entry.getImageResource());
    if ((entry.getImageBitmap()) != null) {
        view.setImageBitmap(entry.getImageBitmap());
    }else
        if ((entry.getImageDrawable()) != null) {
            view.setImageDrawable(entry.getImageDrawable());
        }
    
}