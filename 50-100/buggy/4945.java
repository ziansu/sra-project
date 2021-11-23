public void show(final com.google.gwt.user.client.ui.IsWidget front, final com.google.gwt.user.client.ui.IsWidget back, final org.uberfire.mvp.Command switchCallback) {
    final org.uberfire.mvp.Command c = () -> {
        this.isFront = !(this.isFront);
        switchCallback.execute();
    };
    view.show(front, back, c);
}