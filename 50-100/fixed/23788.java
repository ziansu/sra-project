@java.lang.Override
protected java.util.List<java.lang.Integer> generateCandidatesNotIncludingIntervalExtremes(int start, int end) {
    java.util.List<java.lang.Integer> values = new java.util.ArrayList<>();
    try {
        int offset = offset();
        if (start != offset) {
            values.add(offset);
        }
        int reference = generateNextValue(start);
        while (reference < end) {
            if (reference != offset)
                values.add(reference);
            
            reference = generateNextValue(reference);
        } 
    } catch (com.cronutils.model.time.generator.NoSuchValueException ignored) {
    }
    return values;
}