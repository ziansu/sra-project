public void setLocationRequirement(T locationRequirement) {
    if ((((locationRequirement.getClass()) != (eu.neclab.iotplatform.ngsi.api.datamodel.Point.class)) && ((locationRequirement.getClass()) != (eu.neclab.iotplatform.ngsi.api.datamodel.Circle.class))) && ((locationRequirement.getClass()) != (eu.neclab.iotplatform.ngsi.api.datamodel.Polygon.class))) {
        throw new java.lang.RuntimeException("locationRequirements must be Point, Circle or Polygon");
    }
    this.locationRequirement = locationRequirement;
}