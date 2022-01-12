public boolean isSuspended() {
    if (((isInExile()) && (hasAbility(MagicAbility.Suspend))) && (hasCounters(MagicCounterType.Time))) {
        return true;
    }
    return false;
}