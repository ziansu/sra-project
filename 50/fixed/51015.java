public void saveModel(java.lang.String file) throws java.lang.Exception {
    if ((model) != null) {
        weka.core.SerializationHelper.write(file, model);
    }else {
        java.lang.System.out.println("Model is null");
    }
}