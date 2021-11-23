@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof com.microsoft.azure.management.resources.fluentcore.arm.Region)) {
        return false;
    }else
        if (obj == (this)) {
            return true;
        }else {
            com.microsoft.azure.management.resources.fluentcore.arm.Region rhs = ((com.microsoft.azure.management.resources.fluentcore.arm.Region) (obj));
            return this.name.equalsIgnoreCase(rhs.name);
        }
    
}