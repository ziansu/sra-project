@java.lang.Override
public boolean accept(net.osmand.data.AmenityType type, java.lang.String subcategory) {
    return (type == (net.osmand.data.AmenityType.TRANSPORTATION)) && ("fuel".equals(subcategory));
}