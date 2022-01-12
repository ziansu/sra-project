public static void main(java.lang.String[] args) throws java.io.IOException {
    java.lang.String filename = "datasets/simulated/docs.nips.small.arff";
    eu.amidst.core.datastream.DataStream<eu.amidst.core.datastream.DataInstance> data = eu.amidst.core.io.DataStreamLoader.open(filename);
    eu.amidst.latentvariablemodels.staticmodels.Model model = new eu.amidst.latentvariablemodels.staticmodels.LDA(data.getAttributes());
    model.updateModel(data);
    eu.amidst.core.models.BayesianNetwork bn = model.getModel();
    java.lang.System.out.println(bn);
    eu.amidst.core.io.BayesianNetworkWriter.save(bn, "networks/simulated/exampleBN.bn");
}