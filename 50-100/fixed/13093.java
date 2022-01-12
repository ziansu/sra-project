@java.lang.Override
public net.anei.cadpage.parsers.OH.Field getField(java.lang.String name) {
    if (name.equals("ST"))
        return new net.anei.cadpage.parsers.OH.StateField("([A-Z]{2})(?: +\\d{5})?", true);
    
    if (name.equals("X"))
        return new net.anei.cadpage.parsers.OH.OHFairfieldCountyParser.MyCrossField();
    
    return super.getField(name);
}