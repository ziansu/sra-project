@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof Sentence.PADependencyTuple) {
        Sentence.PADependencyTuple PADepTuple = ((Sentence.PADependencyTuple) (obj));
        if ((PADepTuple.predIndex) != (predIndex))
            return false;
        
        if ((PADepTuple.argIndex) != (argIndex))
            return false;
        
        if (!(PADepTuple.srl.equals(srl)))
            return false;
        
        return true;
    }
    return false;
}