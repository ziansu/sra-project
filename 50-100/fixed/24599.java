@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if ((getClass()) != (obj.getClass())) {
        return false;
    }
    if (!(super.equals(obj))) {
        return false;
    }
    com.pavluchenko.entity.Count count1 = ((com.pavluchenko.entity.Count) (obj));
    if ((count) != (count1.count)) {
        return false;
    }
    return true;
}