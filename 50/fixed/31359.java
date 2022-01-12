@java.lang.Override
public void onFailure() {
    if ((progressBar) != null)
        progressBar.setVisibility(View.GONE);
    
}