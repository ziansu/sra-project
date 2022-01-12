@java.lang.Override
public boolean equals(java.lang.Object that) {
    if (that instanceof nl.tudelft.pixelperfect.event.EventParameter) {
        nl.tudelft.pixelperfect.event.EventParameter other = ((nl.tudelft.pixelperfect.event.EventParameter) (that));
        if ((key) != (other.getKey())) {
            return false;
        }
        if ((isGeneric()) && (other.isGeneric())) {
            return (number) == (other.getNumber());
        }else {
            return value.equals(other.getValue());
        }
    }
    return false;
}