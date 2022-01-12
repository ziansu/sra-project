public void subReputation(long amount) {
    long globalMax = io.github.griffenx.CityZen.CityZen.getPlugin().getConfig().getLong("reputation.maximum");
    long rep;
    if ((amount < 0) && ((java.lang.Math.abs(amount)) > (globalMax - (getReputation()))))
        rep = globalMax;
    else
        rep = (getReputation()) - amount;
    
    fixRep();
    setProperty("reputation", rep);
    if (rep > (getMaxReputation()))
        setMaxReputation(rep);
    
}