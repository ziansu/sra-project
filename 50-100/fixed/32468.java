public static void clean() {
    java.util.Iterator<java.lang.Long> itr = edu.utexas.cs.nn.evolution.ScoreHistory.allScores.keySet().iterator();
    while (itr.hasNext()) {
        java.lang.Long id = itr.next();
        if (((edu.utexas.cs.nn.evolution.ScoreHistory.accessed.get(id)) != null) && (!(edu.utexas.cs.nn.evolution.ScoreHistory.accessed.get(id)))) {
            itr.remove();
            edu.utexas.cs.nn.evolution.ScoreHistory.accessed.remove(id);
        }
    } 
    edu.utexas.cs.nn.evolution.ScoreHistory.resetAccess();
}