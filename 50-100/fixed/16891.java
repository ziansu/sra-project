private java.util.List<au.com.mutopia.acs.models.c3ml.C3mlEntity> buildEntities() throws au.com.mutopia.acs.exceptions.InvalidColladaException {
    java.util.List<au.com.mutopia.acs.models.c3ml.C3mlEntity> c3mlEntities = com.google.common.collect.Lists.newArrayList();
    for (com.dddviewr.collada.nodes.Node node : visualScene.getNodes()) {
        com.dddviewr.collada.visualscene.Matrix matrix = new com.dddviewr.collada.visualscene.Matrix("identity");
        matrix.setData(au.com.mutopia.acs.conversion.impl.ColladaConverter.IDENTITY);
        c3mlEntities.add(buildEntityFromNode(node, matrix));
    }
    return c3mlEntities;
}