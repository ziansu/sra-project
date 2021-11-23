@java.lang.Override
public void onPositive(com.afollestad.materialdialogs.MaterialDialog dialog) {
    com.inipage.homelylauncher.views.DockElement toRemove = null;
    for (com.inipage.homelylauncher.views.DockElement de : elements) {
        if ((de.getIndex()) == (touchIndex)) {
            toRemove = de;
            break;
        }
    }
    if (toRemove != null) {
        elements.remove(toRemove);
        host.onElementRemoved(touchIndex);
        invalidate();
    }
}