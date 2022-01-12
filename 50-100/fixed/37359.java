@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if ((getClass()) != (obj.getClass())) {
        return false;
    }
    final com.forall.laundry.model.Product other = ((com.forall.laundry.model.Product) (obj));
    return java.util.Objects.equals(this.name, other.name);
}