public void setOfficialArea(java.lang.Double officialArea) {
    if (officialArea == null)
        officialArea = 0.0;
    else
        officialArea = officialArea * 4046.86;
    
    this.setArea(officialArea, SpatialValueAreaBean.TYPE_OFFICIAL);
}