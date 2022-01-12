public boolean setAntiAircraft(boolean AA) {
    if (this.getIsLand()) {
        if ((this.hasAntiAircraft) == true) {
            return false;
        }else {
            this.hasAntiAircraft = AA;
            return true;
        }
    }else {
        return false;
    }
}