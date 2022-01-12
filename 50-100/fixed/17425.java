public void runOnNodeToAttributeMatric() {
    edu.ucsf.rbvi.clusterMaker2.internal.algorithms.attributeClusterers.Matrix matrix = new edu.ucsf.rbvi.clusterMaker2.internal.algorithms.attributeClusterers.Matrix(network, weightAttributes, false, context.ignoreMissing, context.selectedOnly);
    double[][] matrixArray = matrix.toArray();
    edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ComputationMatrix mat = new edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ComputationMatrix(matrixArray);
    edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ComputationMatrix[] components = this.computePCs(mat, edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.RunPCA.PCA_NODE_ATTRIBUTE);
    if (context.pcaResultPanel)
        edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ResultPanelPCA.createAndShowGui(components, network, networkView, computeVariance(mat));
    
    if (context.pcaPlot)
        edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ScatterPlotPCA.createAndShowGui(components, computeVariance(mat));
    
}