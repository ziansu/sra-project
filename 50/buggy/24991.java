public void setSelectedWO(geom.WorldObject wo) {
    if (((menu) == null) || ((menu) == (enums.WindowTab.EDIT))) {
        updateView(WindowTab.EDIT);
        getDropdown("Object").setItem(wo);
    }
}