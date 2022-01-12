@java.lang.Override
public void run() {
    if (!(view.isComputingLayout())) {
        if (preCount == 0) {
            notifyItemRangeInserted(0, postCount);
        }else {
            view.swapAdapter(this, true);
        }
    }else {
        view.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                notifyItemsLoaded(preCount, postCount);
            }
        }, 10);
    }
}