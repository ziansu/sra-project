@java.lang.Override
public final javafx.beans.property.Property<?> put(java.lang.String key, javafx.beans.property.Property<?> value) throws java.lang.IllegalStateException {
    java.lang.System.out.println(((key + " - ") + value));
    if (containsKey(key)) {
        throw new java.lang.IllegalStateException(((("The final properties already have a property saved for key " + key) + " value: ") + value));
    }
    return super.put(key, value);
}