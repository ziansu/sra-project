public me.noize.chemistry.io.TimeRange extendTo(final long time) {
    if (time < (this.getStart())) {
        return new me.noize.chemistry.io.TimeRange(time, this.getEnd());
    }else
        if ((this.getEnd()) < time) {
            return new me.noize.chemistry.io.TimeRange(this.getStart(), time);
        }else {
            return this;
        }
    
}