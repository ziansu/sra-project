public void compose(appguarden.apppal.evaluation.Unification other) {
    if (other.hasFailed())
        this.fails();
    else {
        for (appguarden.apppal.evaluation.Substitution s : this.theta.values()) {
            for (appguarden.apppal.evaluation.Substitution t : other.theta.values())
                t.substitute(s);
            
            if (!(other.theta.containsValue(s)))
                other.theta.put(s.from, s);
            
        }
        this.theta = other.theta;
    }
}