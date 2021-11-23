public void setPercentageNormal(double percentageNormal) {
    if ((((percentageCautious) + percentageNormal) + (percentageReckless)) == 1) {
    }else
        throw new java.lang.IllegalArgumentException("The sum of driver percentages is not equal to 1");
    
    this.percentageNormal = percentageNormal;
}