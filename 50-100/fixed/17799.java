public void dismissModalView(final com.sponberg.fluid.layout.ModalView modalView) {
    if ((launcherActivity) != null) {
        return ;
    }
    if (modalView == null) {
        return ;
    }
    if (((com.sponberg.fluid.android.activity.FluidActivity) (getCurrentActivity())) == null) {
        return ;
    }
    GlobalState.fluidApp.getSystemService().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            ((com.sponberg.fluid.android.activity.FluidActivity) (getCurrentActivity())).dismissModalView(modalView);
        }
    });
}