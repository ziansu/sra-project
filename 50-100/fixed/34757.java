private edu.harvard.iq.datatags.model.values.CompoundValue intersectValues(java.util.List<edu.harvard.iq.datatags.model.values.CompoundValue> values) {
    boolean first = true;
    edu.harvard.iq.datatags.model.values.CompoundValue result = null;
    for (edu.harvard.iq.datatags.model.values.CompoundValue v : values) {
        if (first) {
            result = v;
            first = false;
        }
        result = result.intersectWith(v);
        if (result == null)
            break;
        
    }
    return result;
}