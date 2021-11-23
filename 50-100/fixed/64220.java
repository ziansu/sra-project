@java.lang.Override
public void saveWS(java.lang.String user, aiss.domain.WordStats ws) {
    java.util.List<aiss.domain.WordStats> antigua = new java.util.ArrayList<>();
    if (wordStats.containsKey(user))
        antigua = wordStats.get(user);
    
    antigua.add(ws);
    wordStats.put(user, antigua);
}