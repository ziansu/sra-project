@java.lang.Override
public void onSuccess() {
    if ((this.progressBar) != null) {
        this.progressBar.setVisibility(View.GONE);
    }
}