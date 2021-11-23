@java.lang.Override
public void setBuildingType(org.openstreetmap.josm.plugins.ods.entities.actual.BuildingType buildingType) {
    this.buildingType = buildingType;
    org.openstreetmap.josm.plugins.ods.primitives.ManagedPrimitive mPrimitive = this.getPrimitive();
    if (mPrimitive != null) {
        mPrimitive.putAll(buildingType.getTags());
    }
}