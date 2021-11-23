@android.support.annotation.Nullable
public java.lang.String getSupervisor(int i) {
    i--;
    if ((i < (sections.length)) && (i >= 0))
        return sections[i].getSupervisor();
    
    return null;
}