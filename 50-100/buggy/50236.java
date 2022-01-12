public android.view.View buildRbmDockedRun(android.view.LayoutInflater li) {
    android.view.View rbmDockedRun = li.inflate(R.layout.right_button_menu_docked_run, null, false);
    rbmDockedRun.setFocusable(true);
    android.widget.TextView close = ((android.widget.TextView) (rbmDockedRun.findViewById(R.id.rbm_close)));
    close.setOnTouchListener(mClose);
    close.setOnHoverListener(hoverListener);
    android.widget.TextView undock = ((android.widget.TextView) (rbmDockedRun.findViewById(R.id.rbm_undock)));
    undock.setOnTouchListener(mUnDock);
    return rbmDockedRun;
}