@java.lang.Override
public boolean expands() {
    return this.fields[((this.fields.length) - 1)].getType().expands();
}