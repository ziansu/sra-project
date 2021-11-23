public void doAction(java.lang.Object obj) {
    Model.Item i = ((Model.Item) (obj));
    try {
        console.println(Control.PlayerControls.useItem(i));
    } catch (exceptions.PlayerControlsException ex) {
        java.util.logging.Logger.getLogger(View.PickupView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}