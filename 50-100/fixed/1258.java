private org.eclipse.gef.palette.PaletteContainer createDataMapper1Group() {
    org.eclipse.gef.palette.PaletteDrawer paletteContainer = new org.eclipse.gef.palette.PaletteDrawer("Operators");
    paletteContainer.setId("createDataMapper1Group");
    paletteContainer.add(createDataMapperLink1CreationTool());
    paletteContainer.add(createConcat3CreationTool());
    paletteContainer.add(createSplit4CreationTool());
    paletteContainer.add(createLowerCase6CreationTool());
    paletteContainer.add(createUpperCase8CreationTool());
    paletteContainer.setInitialState(org.wso2.developerstudio.datamapper.diagram.part.DataMapperPaletteFactory.INITIAL_STATE_CLOSED);
    return paletteContainer;
}