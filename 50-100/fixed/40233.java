public static void onSubmit(java.util.Hashtable<java.lang.String, java.lang.Double> params) {
    java.util.ArrayList<Data.Species> pDataset = core.Client.preprocess.scale(core.Client.dataset);
    pDataset = core.Client.preprocess.reduceFeatures(pDataset);
    core.Client.svm.buildModel(params, pDataset);
    core.Client.model = new Data.ClassifierModel();
    core.Client.model.setCreatedDate(new java.util.Date());
    core.Client.model.setIJUsed(true);
    core.Client.model.setPreprocessModel(core.Client.preprocess.getModel());
    core.Client.model.setSvmmodel(core.Client.svm.getSVMModel());
}