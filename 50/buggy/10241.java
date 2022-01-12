@java.lang.Override
public void run() {
    if (loading)
        progressBar.setVisibility(View.VISIBLE);
    else
        progressBar.setVisibility(View.INVISIBLE);
    
}