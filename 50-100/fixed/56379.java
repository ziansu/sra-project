public void load(java.io.File aFile) {
    try {
        spirograph.SpiroModel newModel = spiroFile.load(spiroModel, aFile);
        spiroModel.getSpiroView().loadSpiroModel(newModel);
    } catch (java.lang.Exception anException) {
        anException.printStackTrace();
    }
    return ;
}