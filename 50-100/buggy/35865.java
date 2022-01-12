@javax.persistence.Transient
public java.util.Date getLastResultTime() {
    java.util.Date d = null;
    if ((boards) != null) {
        for (de.unibayreuth.bayceer.bayeos.gateway.model.Board b : boards) {
            if (d == null) {
                d = b.getLastResultTime();
            }else {
                if (b.getLastResultTime().after(d)) {
                    d = b.getLastResultTime();
                }
            }
        }
    }
    return d;
}