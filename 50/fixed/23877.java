@java.lang.Override
public void onBackPressed() {
    if ((i) == 1) {
        i = 0;
        navigationMenu.redirect(com.wdfeww.docgl.Profile.class);
    }else
        navigationMenu.redirect();
    
}