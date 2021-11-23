public void setTitle(java.lang.String title) throws uk.ac.ebi.pride.jmztab.MzTabParsingException {
    if (title == null)
        return ;
    
    checkStringValue(title);
    this.title = title;
}