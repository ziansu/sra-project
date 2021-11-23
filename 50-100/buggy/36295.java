@java.lang.Override
public org.exschool.pocketworld.building.ResourceBuildingDto apply(org.exschool.pocketworld.resource.building.model.ResourceBuilding resourceBuilding) {
    org.apache.commons.lang.Validate.notNull(resourceBuilding);
    return org.exschool.pocketworld.building.ResourceBuildingDto.builder().type(resourceBuilding.getResourceType().name()).level(resourceBuilding.getLevel()).position(resourceBuilding.getPosition()).build();
}