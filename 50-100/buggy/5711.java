@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if ((getClass()) != (obj.getClass())) {
        return false;
    }
    final com.zlthnrtm.ts.Vertex other = ((com.zlthnrtm.ts.Vertex) (obj));
    if (!(java.util.Objects.equals(this.index, other.index))) {
        return false;
    }
    return true;
}