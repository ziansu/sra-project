public com.epimorphics.simpleAPI.views.PropertySpec clone() {
    com.epimorphics.simpleAPI.views.PropertySpec ps = new com.epimorphics.simpleAPI.views.PropertySpec(jsonname, property);
    ps.optional = optional;
    ps.multivalued = multivalued;
    ps.filterable = filterable;
    ps.range = range;
    ps.comment = comment;
    ps.valueBase = valueBase;
    ps.hide = hide;
    ps.nested = nested;
    ps.excludedValues = excludedValues;
    return ps;
}