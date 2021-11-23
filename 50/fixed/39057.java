public void setDescription(java.lang.String description) throws uk.ac.ebi.pride.jmztab.MzTabParsingException {
    if (description == null)
        return ;
    
    checkStringValue(description);
    this.description = description;
}