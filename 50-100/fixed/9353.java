@java.lang.Override
public void onNavigationBlocked(int position, int direction) {
    android.view.View contentView = findViewById(android.R.id.content);
    if (contentView != null) {
        com.heinrichreimersoftware.materialintro.slide.Slide slide = getSlide(position);
        if (slide == permissionsSlide) {
            android.support.design.widget.Snackbar.make(contentView, R.string.label_grant_permissions, Snackbar.LENGTH_LONG).show();
        }else
            if (slide == loginSlide) {
                android.support.design.widget.Snackbar.make(contentView, R.string.label_fill_out_form, Snackbar.LENGTH_LONG).show();
            }
        
    }
}