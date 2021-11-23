@java.lang.Override
public int hashCode() {
    int result = getName().hashCode();
    result = (31 * result) + ((getValue()) != (+0.0F) ? java.lang.Float.floatToIntBits(getValue()) : 0);
    result = (31 * result) + ((getAdditionalValue()) != (+0.0F) ? java.lang.Float.floatToIntBits(getAdditionalValue()) : 0);
    return result;
}