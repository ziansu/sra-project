private boolean canDisplay() {
    nextapp.echo2.app.ApplicationInstance instance = nextapp.echo2.app.ApplicationInstance.getActive();
    return (instance != null) && ((instance.getDefaultWindow()) != null);
}