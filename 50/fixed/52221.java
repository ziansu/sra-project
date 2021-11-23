private org.matsim.api.core.v01.population.Activity getPersonHomeLocation(java.util.List<org.matsim.api.core.v01.population.Activity> allActivities) {
    for (org.matsim.api.core.v01.population.Activity a : allActivities)
        if (a.getType().startsWith("home"))
            return a;
        
    
    throw new java.lang.NullPointerException("The activity type home is not known to the agent!");
}