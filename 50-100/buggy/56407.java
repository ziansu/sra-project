public void decreaseHealth(double value) {
    java.lang.System.out.println(this.isOnCity);
    if ((this.isOnCity) == true) {
        setHealth(((getHealth()) - (value / (InfantryDefault.getCityDamageReduction()))));
    }else
        setHealth(((getHealth()) - value));
    
}