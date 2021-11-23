public Recycling.RecyclingData.RecyclingMachine selectedRCM() {
    if ((RMOS.getMachines().isEmpty()) || ((rcmJList.getModel().getSize()) == 0))
        return null;
    else
        java.lang.System.out.println(RMOS);
    
    return RMOS.getMachines().get(rcmJList.getSelectedIndex());
}