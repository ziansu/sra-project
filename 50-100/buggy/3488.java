public void dismissModalView(final com.sponberg.fluid.layout.ModalView modalView) {
    android.app.Dialog d = ((android.app.Dialog) (modalView.getFluidData()));
    if (d == null) {
        return ;
    }
    try {
        d.dismiss();
    } catch (java.lang.IllegalArgumentException e) {
    }
}