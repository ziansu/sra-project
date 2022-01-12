private void setImage(android.widget.ImageView view, org.bbqapp.android.view.MenuAdapter.Text entry) {
    if ((entry.getImageResource()) != null) {
        view.setImageResource(entry.getImageResource());
    }else
        if ((entry.getImageBitmap()) != null) {
            view.setImageBitmap(entry.getImageBitmap());
        }else
            if ((entry.getImageDrawable()) != null) {
                view.setImageDrawable(entry.getImageDrawable());
            }
        
    
}