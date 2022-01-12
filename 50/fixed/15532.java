protected void setButtonState(@android.support.annotation.Nullable
android.view.View button, boolean show) {
    if (button == null) {
        return ;
    }
    if (show) {
        button.setVisibility(View.VISIBLE);
    }else {
        button.setVisibility(View.INVISIBLE);
    }
}