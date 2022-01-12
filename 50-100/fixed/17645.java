@java.lang.Override
public void finish() {
    if (close)
        super.finish();
    
    if ((dialogLogout.getVisibility()) == (android.view.View.VISIBLE)) {
        dialogLogout.setVisibility(View.GONE);
    }else
        if ((dialogLogoutB.getVisibility()) == (android.view.View.VISIBLE)) {
            dialogLogoutB.setVisibility(View.GONE);
            close = false;
        }else
            dialogLogoutB.setVisibility(View.VISIBLE);
        
    
}