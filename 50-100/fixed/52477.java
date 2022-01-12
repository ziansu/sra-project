@java.lang.Override
public void toString(java.lang.String prefix, java.lang.StringBuilder buffer) {
    super.toString(prefix, buffer);
    buffer.append(ModifierTypes.FIELD.toString(this.modifiers));
    this.type.toString("", buffer);
    buffer.append(' ');
    buffer.append(this.name);
    if ((this.value) != null) {
        buffer.append(Formatting.Field.keyValueSeperator);
        this.value.toString(prefix, buffer);
    }
}