public ru.fly.client.ui.panel.messagebox.MessageBox center() {
    setLeft((((com.google.gwt.user.client.Window.getClientWidth()) - (getWidth(false))) / 2));
    setTop((((com.google.gwt.user.client.Window.getClientHeight()) - (getHeight(false))) / 2));
    return this;
}