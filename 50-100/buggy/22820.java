protected void discoverInfoFields(ca.mcgill.mcb.pcingola.vcf.VcfEntry vcfEntry) {
    if (!(useInfoFieldAll))
        return ;
    
    infoFields = new java.util.HashSet<java.lang.String>();
    for (java.lang.String info : vcfEntry.getInfoKeys()) {
        if (!(info.isEmpty()))
            infoFields.add(info);
        
    }
}