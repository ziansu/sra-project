public java.lang.Object getDisplayData() {
    if ((this.displayData) == null)
        return null;
    
    return new io.mlh.utilities.DisplayDataProcessUtils(displayMetadata.getDisplayElementConfig().getGroupedBy()).process(displayData, displayMetadata);
}