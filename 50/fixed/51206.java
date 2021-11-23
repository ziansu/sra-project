private void loadModel(dnnUtil.dnnModel.DnnModelDescriptor modelDescriptor) {
    jniLoadModel(modelDescriptor.getBinaryData());
    jniGetWeightsData();
}