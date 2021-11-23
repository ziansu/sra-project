@java.lang.Override
public void onBackPressed() {
    if ((this.pager.getCurrentItem()) != 0) {
        this.pager.setCurrentItem(0);
    }else
        moveTaskToBack(true);
    
}