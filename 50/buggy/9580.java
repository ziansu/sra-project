private org.apache.lucene.search.spans.SpanQuery fixField(org.apache.lucene.search.spans.SpanQuery query) {
    if (query.getField().equals(field.getStandard())) {
        return query;
    }
    return new org.apache.lucene.search.spans.FieldMaskingSpanQuery(query, field.getStandard());
}