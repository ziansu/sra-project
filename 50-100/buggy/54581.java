@java.lang.Override
public int hashCode() {
    int hash = 0;
    if ((this.getId()) != null) {
        hash = this.getId().hashCode();
    }else {
        if ((this.getSource()) != null) {
            hash += (this.getSource().hashCode()) * 31;
            if ((this.getTarget()) != null) {
                hash += this.getTarget().hashCode();
            }
        }
    }
    return hash;
}