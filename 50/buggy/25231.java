public boolean isRetire() {
    if (((selectedData) != null) && (selectedData.getCmqStatus().equals("A")))
        return false;
    
    return true;
}