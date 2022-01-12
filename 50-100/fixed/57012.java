public void closeWindow() {
    this.open = true;
    gwt.material.design.addins.client.window.CloseEvent.fire(this, false);
    if ((closeAnimation) == null) {
        closeMixin.setOn(false);
    }else {
        closeAnimation.animate(window, new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                closeMixin.setOn(false);
            }
        });
    }
}