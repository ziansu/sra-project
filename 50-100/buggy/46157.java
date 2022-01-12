@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == (this)) {
        return true;
    }
    if ((this.getClass()) != (obj.getClass())) {
        return false;
    }
    return equalsMainProperties(((gui.propertysheet.types.StringListProperty) (obj)));
}