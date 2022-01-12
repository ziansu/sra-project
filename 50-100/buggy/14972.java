public void rebuildUi() {
    if ((android.os.Looper.getMainLooper().getThread()) == (java.lang.Thread.currentThread())) {
        mostOuterBox.removeAllViews();
        createCardWithContent();
        mostOuterBox.addView(card);
    }else {
        simpleui.modifiers.v3.M_Container.myHandler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                rebuildUi();
            }
        });
    }
}