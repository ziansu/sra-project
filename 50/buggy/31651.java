void run() {
    if ((adapter.getParent().getLayout()) instanceof org.eclipse.swt.custom.StackLayout) {
        reconcileStackLayout();
    }
}