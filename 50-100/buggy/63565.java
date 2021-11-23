@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.github.u1152.uportal.model.Articals articals = ((com.github.u1152.uportal.model.Articals) (o));
    if ((getId()) != (articals.getId()))
        return false;
    else {
        return true;
    }
}