void run() {
    if (((adapter.getParent()) != null) && ((adapter.getParent().getLayout()) instanceof org.eclipse.swt.custom.StackLayout)) {
        reconcileStackLayout();
    }
}