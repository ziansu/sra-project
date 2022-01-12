public void addWaitlist(io.github.griffenx.CityZen.Citizen citizen) {
    java.util.List<java.lang.String> citizens = new java.util.Vector<java.lang.String>();
    for (io.github.griffenx.CityZen.Citizen c : getWaitlist()) {
        if (c.equals(citizen))
            return ;
        
        citizens.add(c.getUUID().toString());
    }
    citizens.add(citizen.getUUID().toString());
    setProperty("waitlist", citizens);
}