@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof com.microsoft.azure.management.compute.PowerState)) {
        return false;
    }else
        if (obj == (this)) {
            return true;
        }else {
            com.microsoft.azure.management.compute.PowerState rhs = ((com.microsoft.azure.management.compute.PowerState) (obj));
            if ((value) == null) {
                return (rhs.value) == null;
            }else {
                return value.equals(rhs.value);
            }
        }
    
}