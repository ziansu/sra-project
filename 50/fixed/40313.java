@java.lang.Override
public net.anei.cadpage.parsers.LA.Field getField(java.lang.String name) {
    if (name.equals("ADDR"))
        return new net.anei.cadpage.parsers.LA.LATerrebonneParishParser.MyAddressField(false);
    
    return super.getField(name);
}