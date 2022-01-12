public void decreaseHealth(double value) {
    java.lang.System.out.println(this.isOnCity);
    if ((this.isOnCity) == true) {
        setHealth(((int) ((getHealth()) - (value / (InfantryDefault.getCityDamageReduction())))));
    }else
        setHealth(((int) ((getHealth()) - value)));
    
}