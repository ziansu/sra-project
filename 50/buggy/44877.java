@java.lang.Override
public boolean isReady() {
    if ((this.value) == null)
        return false;
    
    return value.isReady();
}