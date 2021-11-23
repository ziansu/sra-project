public com.wasteofplastic.districts.DistrictRegion getInDistrict(org.bukkit.Location location) {
    grid.get(location.getWorld().getName()).getDistrictRegionAt(location);
    return null;
}