public java.lang.Object getDisplayData() {
    return new io.mlh.utilities.DisplayDataProcessUtils(displayMetadata.getDisplayElementConfig().getGroupedBy()).process(displayData, displayMetadata);
}