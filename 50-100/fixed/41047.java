public void addMatParam(java.lang.String name, java.lang.String type, java.awt.Point point) {
    java.lang.String fixedType = type;
    if (type.equals("Color")) {
        fixedType = "Vector4";
    }
    fixedType = spix.swing.materialEditor.controller.VarType.valueOf(fixedType).getGlslType();
    spix.swing.materialEditor.controller.ShaderNodeVariable param = new spix.swing.materialEditor.controller.ShaderNodeVariable(fixedType, "MatParam", name);
    spix.swing.materialEditor.controller.NodePanel node = diagramUiHandler.addInputPanel(this, param);
    node.setLocation(point);
    diagramUiHandler.refreshDiagram();
    dataHandler.addMatParam(param, type);
}