private static com.emergentorganization.cellrpg.tools.map.MapObject parseItem(org.w3c.dom.Node item) {
    if (item.getNodeName().contentEquals("image")) {
        com.badlogic.gdx.math.Vector2 offset = new com.badlogic.gdx.math.Vector2();
        return com.emergentorganization.cellrpg.tools.map.MapLoader.parseImage(item, offset);
    }else
        if (item.getNodeName().contentEquals("#text")) {
        }else {
            com.emergentorganization.cellrpg.tools.map.MapLoader.print((("parsing for item " + (item.getNodeName())) + " is unsupported"));
        }
    
    return null;
}