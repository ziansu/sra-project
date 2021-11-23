@java.lang.Override
public void setRefreshEnable(final boolean enable) {
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            binding.swipeRefresh.setEnabled(enable);
        }
    });
}