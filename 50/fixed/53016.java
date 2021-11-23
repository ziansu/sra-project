private it.polimi.ingsw.cg_23.model.map.SectorTypeEnum getSectorTypeValue(org.w3c.dom.Element ele, java.lang.String tagName) {
    java.lang.String value = getTextValue(ele, tagName).toUpperCase();
    return it.polimi.ingsw.cg_23.model.map.SectorTypeEnum.valueOf(value);
}