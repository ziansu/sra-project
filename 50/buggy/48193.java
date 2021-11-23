@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager manager = getFragmentManager();
    com.littlegeektoys.www.picturepurrfect.ColorPickerFragment dialog = com.littlegeektoys.www.picturepurrfect.ColorPickerFragment.newInstance();
    dialog.setTargetFragment(this, com.littlegeektoys.www.picturepurrfect.BottomMenuFragment.REQUEST_COLOR);
    dialog.show(manager, com.littlegeektoys.www.picturepurrfect.BottomMenuFragment.DIALOG_COLOR_INPUT);
    mCallbacks.onToolSelect(MenuToolInterface.ToolName.COLOR);
}