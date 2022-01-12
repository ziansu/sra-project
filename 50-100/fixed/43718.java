private static java.lang.Integer convertAlleleToDiploidCode(org.bdgenomics.formats.avro.GenotypeAllele ga) {
    if (ga == null) {
        return null;
    }else
        if (ga == (org.bdgenomics.formats.avro.GenotypeAllele.Ref)) {
            return 0;
        }else
            if (ga == (org.bdgenomics.formats.avro.GenotypeAllele.Alt)) {
                return 1;
            }else
                if (ga == (org.bdgenomics.formats.avro.GenotypeAllele.OtherAlt)) {
                    return 2;
                }else
                    if (ga == (org.bdgenomics.formats.avro.GenotypeAllele.NoCall)) {
                        return 4;
                    }else {
                        throw new java.lang.IllegalStateException("Invalid ordinal for GenotypeAllele enum");
                    }
                
            
        
    
}