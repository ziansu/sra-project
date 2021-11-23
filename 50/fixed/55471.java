void setAgeMin(java.lang.Integer ageMin) {
    if (ageMin == null)
        return ;
    
    if ((this.ageMin) == null)
        this.ageMin = ageMin;
    
    if ((this.ageMin) > ageMin)
        this.ageMin = ageMin;
    
}