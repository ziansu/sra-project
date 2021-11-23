public int GetPreparedFeature(java.lang.String RawFeature) {
    int Result = 0;
    if (MainCounterSorted.contains(RawFeature)) {
        java.lang.Integer ID = MainCounterSorted.get(RawFeature);
        if (ID <= (maxID)) {
            Result = ID;
        }
    }
    return Result;
}