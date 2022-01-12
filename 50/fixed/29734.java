@java.lang.Override
public java.util.List<java.lang.String> availableDistrictNames(java.lang.String stateName) {
    java.util.List<java.lang.String> names = new java.util.ArrayList(regionProvider.getDistrictNames(stateName));
    names.add(org.motechproject.nms.ldapbrowser.region.RegionServiceImpl.ALL);
    return names;
}