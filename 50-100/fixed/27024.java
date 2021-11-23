@java.lang.Override
public java.util.List<java.lang.String> then(bolts.Task<java.util.List<java.lang.String>> task) throws java.lang.Exception {
    java.util.List<java.lang.String> recommendation = task.getResult();
    if (!(recommendation.isEmpty()))
        return null;
    
    java.util.List<java.lang.String> bootstrapRec = new java.util.ArrayList<java.lang.String>();
    bootstrapRec.add("ChIJh2E4tQIq9ocRmxkXDVB0zZQ");
    recommendation.addAll(bootstrapRec);
    return recommendation;
}