@javax.persistence.Transient
public java.lang.Integer getGroupStatus() {
    java.lang.Integer ret = null;
    if ((boards) != null) {
        for (de.unibayreuth.bayceer.bayeos.gateway.model.Board b : boards) {
            if ((b.getStatus()) != null) {
                if (ret != null) {
                    if ((b.getStatus()) > ret) {
                        ret = b.getStatus();
                    }
                }else {
                    ret = b.getStatus();
                }
            }
        }
    }
    return ret;
}