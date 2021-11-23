private synchronized void assessBestFormation() {
    java.util.Map.Entry<java.lang.Integer, java.lang.Long> bestFormation = estimatedBudgets.firstEntry();
    if (bestFormation == null)
        return ;
    
    estimatedBudgets.remove(bestFormation.getKey());
    knownBudgets.remove(bestFormation.getValue());
    discardedFormations.put(bestFormation.getValue(), bestFormation.getKey());
}