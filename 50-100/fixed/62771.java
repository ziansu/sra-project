@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (parent.getId()) {
        case R.id.menu_spinner :
            switch (position) {
                case 0 :
                    mUtil.setBooleanState(com.jrdcom.systrace.StartAtraceActivity.ICON_SHOW, true);
                    break;
                case 1 :
                    mUtil.setBooleanState(com.jrdcom.systrace.StartAtraceActivity.ICON_SHOW, false);
                    break;
            }
    }
}