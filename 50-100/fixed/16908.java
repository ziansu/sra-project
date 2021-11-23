private void initFxScene() {
    fxpanel.setScene(scene3DController.create3DScene(java.lang.Math.max(this.jPanel1.getPreferredSize().width, this.jPanel1.getSize().width), java.lang.Math.max(this.jPanel1.getPreferredSize().height, this.jPanel1.getSize().height)));
}