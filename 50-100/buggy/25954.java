@java.lang.Override
public void toggledSelection(int position) {
    int count = getSelectedItemCount();
    if (count == 0) {
        com.ha81dn.webausleser.MainActivity.appActionMode.finish();
    }else {
        com.ha81dn.webausleser.MainActivity.appActionMode.setTitle(java.lang.String.valueOf(count));
        com.ha81dn.webausleser.MainActivity.appActionMode.invalidate();
    }
}