@java.lang.Override
public net.anei.cadpage.parsers.OH.Field getField(java.lang.String name) {
    if (name.equals("DATETIME"))
        return new net.anei.cadpage.parsers.OH.DateTimeField("\\d\\d/\\d\\d/\\d{4} \\d\\d:\\d\\d", true);
    
    if (name.equals("CALL"))
        return new net.anei.cadpage.parsers.OH.OHHamiltonCountyBParser.MyCallField();
    
    if (name.equals("INFO"))
        return new net.anei.cadpage.parsers.OH.OHHamiltonCountyBParser.MyInfoField();
    
    return super.getField(name);
}