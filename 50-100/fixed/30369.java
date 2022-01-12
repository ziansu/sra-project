private void computeMaxAlt() {
    if ((this.getTrackPointsCount()) > 0) {
        java.lang.Double max_alt = 0.0;
        for (int i = 0; i < ((this.getTrackPointsCount()) - 1); i++) {
            if (max_alt < (this.getTrackPoints().get(i).getAltitude()))
                max_alt = this.getTrackPoints().get(i).getAltitude();
            
        }
        this.setMax_alt(max_alt);
    }
}