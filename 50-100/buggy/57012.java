public void closeWindow() {
    this.open = true;
    gwt.material.design.addins.client.window.CloseEvent.fire(this, false);
    java.lang.Runnable callback = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            closeMixin.setOn(false);
        }
    };
    if ((closeAnimation) == null) {
        callback.run();
    }else {
        closeAnimation.animate(window, callback);
    }
}