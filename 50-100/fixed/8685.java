@java.lang.Override
public void run() {
    if ((getActivity()) == null)
        return ;
    
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            int i = bnp.getProgress();
            if (i < count) {
                bnp.incrementProgressBy(1);
            }
        }
    });
}