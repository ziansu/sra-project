@java.lang.Override
public void finish() {
    if ((dialogLogout.getVisibility()) == (android.view.View.VISIBLE)) {
        dialogLogout.setVisibility(View.GONE);
    }else
        if ((dialogLogoutB.getVisibility()) == (android.view.View.VISIBLE)) {
            dialogLogoutB.setVisibility(View.GONE);
        }else {
            if (close)
                super.finish();
            else
                dialogLogoutB.setVisibility(View.VISIBLE);
            
        }
    
}