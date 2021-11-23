@java.lang.Override
public java.lang.Integer getAddedArea(int newparcel, int oldparcel) {
    java.util.Map addmap = map.get(newparcel);
    java.lang.Integer areaadded = null;
    if (addmap != null) {
        areaadded = ((java.lang.Integer) (addmap.get(oldparcel)));
    }
    return areaadded;
}