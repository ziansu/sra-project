public void setFilterType(java.lang.String value) {
    filterType = value;
    removeAll();
    switch (filterType) {
        case "Color" :
        case "Gray" :
            addItem("Width", widthField);
            addItem("Height", heightField);
            break;
        case "Threshold" :
            addItem("Width", widthField);
            addItem("Height", heightField);
            addItem("Threshold", thresholdField);
            break;
    }
}