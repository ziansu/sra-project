public void addShapeRule(java.lang.String name, javafx.scene.paint.Color color) {
    if ((name == null) || (color == null))
        return ;
    
    if (allStructuresList.contains(name)) {
        name = name.trim();
        java.util.ArrayList<wormguides.SearchOption> optionsArray = new java.util.ArrayList<wormguides.SearchOption>();
        optionsArray.add(SearchOption.MULTICELLULAR);
        wormguides.model.ShapeRule rule = new wormguides.model.ShapeRule(name, color, optionsArray);
        rulesList.add(rule);
    }
}