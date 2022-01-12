public void refresh(boolean reexamineData) {
    if (reexamineData) {
        if ((dataType) == (HeatmapDataType.LDAConfiguration)) {
            binnedData = examineLDAConfigurations();
            this.refresh(allLDAConfigurations, chosenLDAConfigurations, key1, key2, false, dataBinding);
        }else
            if ((dataType) == (HeatmapDataType.MDSCoordinates)) {
                binnedData = examineMDSCoordinateData();
                this.refresh(coordinates, coordinateExtrema);
            }
        
    }else {
        if ((binnedData) != null)
            draw(binnedData, false);
        
    }
}