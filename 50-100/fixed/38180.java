public void setAsg1(float a1) {
    boolean as1IsValid = (a1 > 0) || (a1 < (datamanagement.UnitManager.UM().getUnit(unitCode_).getAsg1Weight()));
    java.lang.System.out.println(as1IsValid);
    if (as1IsValid == false) {
        throw new java.lang.RuntimeException("Mark cannot be less than zero or greater than assessment weight");
    }
    this.asg1_ = a1;
}