private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    if (!(jTextField3.getText().isEmpty())) {
        App.login.blueNodeAddress = jTextField3.getText();
        if (jTextField4.getText().isEmpty()) {
            App.login.blueNodePort = kostiskag.unitynetwork.rednode.App.defaultBlueNodeAuthPort;
        }else {
            App.login.blueNodePort = java.lang.Integer.parseInt(jTextField4.getText());
        }
        App.login.useNetworkSelectedBN = true;
        App.login.toggleLogin();
        setVisible(false);
    }
}