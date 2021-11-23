private java.util.Set<java.util.Map<java.lang.String, java.lang.Object>> getSpec(de.itagile.despot.Method method, java.lang.String uri, de.itagile.despot.http.ConsumesSpecified.Consumes consumes, java.util.Map completeSpec, java.util.Map mediaTypeSpec) {
    java.util.Set result = expand(normalize(completeSpec), normalize(mediaTypeSpec));
    java.util.Set<de.itagile.despot.DespotSpecParser.Transformation> transformations = new java.util.HashSet<>();
    transformations.add(de.itagile.despot.http.ConsumesSpecified.createTransformation());
    return filter(transform(result, transformations), method, uri, consumes);
}