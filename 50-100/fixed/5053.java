@java.lang.Override
public cz.cuni.mff.d3s.spl.interpretation.Relation get(double significanceLevel) {
    boolean lt = (statistic) > (getCriticalValue(significanceLevel));
    boolean gt = (statistic) < (getCriticalValue((1.0 - significanceLevel)));
    if (lt && gt) {
        return Relation.EQUAL;
    }else
        if (lt) {
            return Relation.GREATER_THAN;
        }else {
            return Relation.LESS_THAN;
        }
    
}