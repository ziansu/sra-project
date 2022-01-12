@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btnSet :
            sjtu.dclab.smartcity.ui.MenuPopupWindow menuPopupWindow = new sjtu.dclab.smartcity.ui.MenuPopupWindow(this);
            menuPopupWindow.showPopupWindow(setButton);
        default :
            break;
    }
}