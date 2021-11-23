public void saveModel(java.lang.String modelname) {
    try {
        weka.core.SerializationHelper.write(modelname, model);
        java.lang.System.out.println("berhasil disave\n");
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("gagal di save\n");
    }
}