public double[] mapSubstrateOutputsToStandardOutputs(double[] outputs) {
    double[] modifiedOutputs = new double[numOutputs];
    if ((numOutputs) == (edu.utexas.cs.nn.tasks.gridTorus.HyperNEATNNTorusPredPreyController.NUM_OUTPUTS_WITH_NO_ACTION)) {
        modifiedOutputs[NOTHING_INDEX] = outputs[edu.utexas.cs.nn.tasks.gridTorus.HyperNEATNNTorusPredPreyController.SUBSTRATE_NOTHING_INDEX];
    }
    java.lang.System.out.println(java.util.Arrays.toString(outputs));
    modifiedOutputs[edu.utexas.cs.nn.gridTorus.controllers.TorusPredPreyController.UP_INDEX] = outputs[edu.utexas.cs.nn.tasks.gridTorus.HyperNEATNNTorusPredPreyController.SUBSTRATE_UP_INDEX];
    modifiedOutputs[edu.utexas.cs.nn.gridTorus.controllers.TorusPredPreyController.RIGHT_INDEX] = outputs[edu.utexas.cs.nn.tasks.gridTorus.HyperNEATNNTorusPredPreyController.SUBSTRATE_RIGHT_INDEX];
    modifiedOutputs[edu.utexas.cs.nn.gridTorus.controllers.TorusPredPreyController.DOWN_INDEX] = outputs[edu.utexas.cs.nn.tasks.gridTorus.HyperNEATNNTorusPredPreyController.SUBSTRATE_DOWN_INDEX];
    modifiedOutputs[edu.utexas.cs.nn.gridTorus.controllers.TorusPredPreyController.LEFT_INDEX] = outputs[edu.utexas.cs.nn.tasks.gridTorus.HyperNEATNNTorusPredPreyController.SUBSTRATE_LEFT_INDEX];
    return modifiedOutputs;
}