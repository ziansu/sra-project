void setAgeMax(java.lang.Integer ageMax) {
    if (ageMax == null)
        return ;
    
    if ((this.ageMax) == null)
        this.ageMax = ageMax;
    
    if ((this.ageMax) < ageMax)
        this.ageMax = ageMax;
    
}