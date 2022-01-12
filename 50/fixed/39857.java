public void changeSelectedImageLayerUpOrDown(int directionID) throws java.lang.Exception {
    int index = this.taskManager.getSelectedImageLayerAtUpOrDown(directionID);
    if (index > 0)
        setSelectedImageLayerAndImage(index, ID.IMAGELAYER_CHANGE_IMAGELAYER);
    
}