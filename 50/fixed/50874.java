protected ca.mcgill.mcb.pcingola.vcf.VcfInfoType calcReturnType(ca.mcgill.mcb.pcingola.vcf.VcfHeaderInfo vcfInfo) {
    if (isSub())
        return vcfInfo.getVcfInfoType();
    
    if ((vcfInfo.getNumber()) == 1)
        return vcfInfo.getVcfInfoType();
    
    return ca.mcgill.mcb.pcingola.vcf.VcfInfoType.String;
}