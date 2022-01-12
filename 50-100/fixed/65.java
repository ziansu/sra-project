public void setSlsRange(java.lang.String val) throws java.lang.Exception {
    if (val.equals(SlsRangeType.All.toString())) {
        this.slsRange = SlsRangeType.All;
    }else
        if (val.equals(SlsRangeType.Odd.toString())) {
            this.slsRange = SlsRangeType.Odd;
        }else
            if (val.equals(SlsRangeType.Even.toString())) {
                this.slsRange = SlsRangeType.Even;
            }else {
                throw new java.lang.Exception("SlsRange value is invalid");
            }
        
    
    this.store();
}