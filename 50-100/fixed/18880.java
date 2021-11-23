@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if (this.getClass().equals(obj.getClass())) {
        return ((eu.tango.energymodeller.types.usage.RunningAverage) (obj)).property.equals(this.property);
    }
    return false;
}