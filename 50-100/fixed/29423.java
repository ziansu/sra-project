@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if ((getClass()) != (obj.getClass())) {
        return false;
    }
    final com.erudika.para.core.ParaObject other = ((com.erudika.para.core.ParaObject) (obj));
    return java.util.Objects.equals(this.id, other.getId());
}