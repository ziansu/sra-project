@javax.persistence.Transient
public java.util.Date getLastResultTime() {
    java.util.Date d = null;
    if ((boards) != null) {
        for (de.unibayreuth.bayceer.bayeos.gateway.model.Board b : boards) {
            if ((b.getLastResultTime()) != null) {
                if (d != null) {
                    if (b.getLastResultTime().after(d)) {
                        d = b.getLastResultTime();
                    }
                }else {
                    d = b.getLastResultTime();
                }
            }
        }
    }
    return d;
}