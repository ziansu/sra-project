public boolean isValidated() {
    if (!(org.easystogu.utils.Strings.isDateValidate(date)))
        return false;
    
    if ((((((this.majorNetIn) == 0) && ((this.biggestNetIn) == 0)) && ((this.bigNetIn) == 0)) && ((this.midNetIn) == 0)) && ((this.smallNetIn) == 0))
        return false;
    
    if ((this.majorNetIn) <= 0)
        return false;
    
    return true;
}