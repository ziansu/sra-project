@java.lang.Override
public void signIn() {
    shared.communication.proxy.Credentials cred = new shared.communication.proxy.Credentials(getLoginView().getLoginUsername(), getLoginView().getLoginPassword());
    try {
        java.lang.String result = this.getClientFacade().login(cred);
        if (result.equals("Success")) {
            getLoginView().closeModal();
            loginAction.execute();
        }else {
            javax.swing.JOptionPane.showMessageDialog(null, "Login Failed");
        }
    } catch (java.lang.Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, "An error occured");
    }
}