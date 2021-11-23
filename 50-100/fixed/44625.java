@java.lang.Override
public java.util.Collection<nl.tudelft.pixelperfect.event.parameter.EventParameter> createParameters() {
    java.util.Collection<nl.tudelft.pixelperfect.event.parameter.EventParameter> collection = new java.util.ArrayList<nl.tudelft.pixelperfect.event.parameter.EventParameter>();
    collection.add(new nl.tudelft.pixelperfect.event.parameter.EventParameter("positionX", 1));
    collection.add(new nl.tudelft.pixelperfect.event.parameter.EventParameter("positionY", 2));
    collection.add(new nl.tudelft.pixelperfect.event.parameter.EventParameter("armor", nl.tudelft.pixelperfect.event.parameter.EventParameterValues.HOSTILE_SHIP_ARMOR_ENERGY_SHIELD));
    return collection;
}