public boolean equals(java.lang.Object t) {
    if (t instanceof com.vfdev.mimusicservicelib.core.TrackInfo) {
        return (this.id.compareTo(((com.vfdev.mimusicservicelib.core.TrackInfo) (t)).id)) == 0;
    }
    return false;
}