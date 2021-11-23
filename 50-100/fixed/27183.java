public system.Fitness and(system.Fitness fitness) {
    if (!(this.objectiveValues.keySet().equals(fitness.objectiveValues.keySet()))) {
        return null;
    }else {
        system.Fitness ans = new system.Fitness();
        for (java.lang.String key : this.objectiveValues.keySet()) {
            ans.put(key, ((this.objectiveValues.get(key)) * (fitness.objectiveValues.get(key))));
        }
        return ans;
    }
}