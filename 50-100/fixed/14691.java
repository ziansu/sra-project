public boolean equal(org.oreland.entity.TargetLevel other) {
    if ((distribution.size()) != (other.distribution.size()))
        return false;
    
    for (org.oreland.entity.TargetLevel.Distribution d : distribution) {
        org.oreland.entity.TargetLevel.Distribution d2 = other.get(d.level);
        if ((d2 == null) || ((d.count) != (d2.count)))
            return false;
        
    }
    return true;
}