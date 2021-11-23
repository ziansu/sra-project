@java.lang.Override
public java.lang.Object check(android.support.v4.app.FragmentActivity activity, android.support.v4.app.FragmentManager fragmentManager) {
    int index = getIndexOf(target);
    if (index > 1) {
        return getFragmentAt((index - 1));
    }
    return null;
}