private void checkContext(org.eclipse.tcf.internal.cdt.ui.breakpoints.TCFThreadFilterEditor.Context ctx, boolean checked) {
    if (ctx.fIsContainer) {
        java.lang.Object[] threads = fContentProvider.getChildren(ctx);
        for (int i = 0; i < (threads.length); i++) {
            checkContext(((org.eclipse.tcf.internal.cdt.ui.breakpoints.TCFThreadFilterEditor.Context) (threads[i])), checked);
        }
    }
    checkThread(ctx, checked);
}