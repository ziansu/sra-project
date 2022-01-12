public void run() throws org.n52.v3d.worldviz.featurenet.impl.Parse.PajekException {
    org.n52.v3d.worldviz.featurenet.VgFeatureNet net = this.generateFeatureNet();
    org.n52.v3d.worldviz.featurenet.scene.WvizConnectionMapSceneX3d result = this.generateX3dScene(net);
    result.setX3domMode(X3DOMMode);
    result.writeToFile(outputFile);
    org.n52.v3d.worldviz.featurenet.scene.FeatureNetTest.logger.info(("Result written to file! " + (outputFile)));
}