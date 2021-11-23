public java.lang.String getSequenceType() {
    if (genomicRadioButton.isActive()) {
        return FeatureStringEnum.TYPE_GENOMIC.getValue();
    }else
        if (cdnaRadioButton.isActive()) {
            return FeatureStringEnum.TYPE_CDNA.getValue();
        }else
            if (cdsRadioButton.isActive()) {
                return FeatureStringEnum.TYPE_CDS.getValue();
            }else
                if (peptideRadioButton.isActive()) {
                    return FeatureStringEnum.TYPE_PEPTIDE.getValue();
                }else {
                    return FeatureStringEnum.TYPE_GENOMIC.getValue();
                }
            
        
    
}