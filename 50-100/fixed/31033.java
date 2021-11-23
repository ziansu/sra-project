@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    else
        if (obj instanceof net.epoxide.tinker.util.RegistryName) {
            net.epoxide.tinker.util.RegistryName regName = ((net.epoxide.tinker.util.RegistryName) (obj));
            return (this.domain.equals(regName.domain)) && (this.name.equals(regName.name));
        }
    
    return false;
}