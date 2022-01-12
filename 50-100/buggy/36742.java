private java.lang.String getResourceName(int resId) {
    if (resId != 0) {
        final android.content.res.Resources res = getContext().getResources();
        try {
            return res.getResourceName(resId);
        } catch (com.android.systemui.statusbar.phone.android ex) {
            return "(unknown)";
        }
    }else {
        return "(null)";
    }
}