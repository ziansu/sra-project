@javax.persistence.Transient
public java.lang.Integer getGroupStatus() {
    java.lang.Integer ret = null;
    if ((boards) != null) {
        for (de.unibayreuth.bayceer.bayeos.gateway.model.Board b : boards) {
            if (ret == null) {
                ret = b.getStatus();
            }else {
                if ((b.getStatus()) > ret) {
                    ret = b.getStatus();
                }
            }
        }
    }
    return ret;
}