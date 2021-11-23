@java.lang.Override
public java.lang.String toString() {
    java.lang.String result = super.toString();
    return (result + " = ") + (this.definition.toSourceRep());
}