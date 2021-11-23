@java.lang.Override
protected boolean matchesSafely(android.widget.TextView textView) {
    if ((expectedColor) == (-1)) {
        try {
            expectedColor = textView.getResources().getColor(resourceId);
            resourceName = textView.getResources().getResourceEntryName(resourceId);
        } catch (android.content.res.Resources ignored) {
        }
    }
    if ((expectedColor) != (-1)) {
        return (expectedColor) == (textView.getCurrentTextColor());
    }else {
        return false;
    }
}