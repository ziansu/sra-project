public static boolean checkItemStatus(org.eclipse.swt.widgets.MenuItem item, boolean readonly) {
    if (item.isEnabled()) {
        if (readonly) {
            return false;
        }else {
            return true;
        }
    }else {
        if (readonly) {
            return true;
        }else {
            return false;
        }
    }
}