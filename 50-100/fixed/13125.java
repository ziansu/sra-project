@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((obj == null) || (!(obj instanceof nl.solutionweb.rbysim.stats.AbstractStats))) {
        return false;
    }
    nl.solutionweb.rbysim.stats.AbstractStats other = ((nl.solutionweb.rbysim.stats.AbstractStats) (obj));
    for (nl.solutionweb.rbysim.stats.StatType statType : nl.solutionweb.rbysim.stats.StatType.values()) {
        if ((getStatValue(statType)) != (other.getStatValue(statType))) {
            return false;
        }
    }
    return true;
}