@com.fasterxml.jackson.annotation.JsonCreator
public org.graylog2.indexer.searches.SearchesConfig create(@com.fasterxml.jackson.annotation.JsonProperty(value = "query")
java.lang.String query, @com.fasterxml.jackson.annotation.JsonProperty(value = "filter")
@javax.annotation.Nullable
java.lang.String filter, @com.fasterxml.jackson.annotation.JsonProperty(value = "fields")
@javax.annotation.Nullable
java.util.List<java.lang.String> fields, @com.fasterxml.jackson.annotation.JsonProperty(value = "range")
org.graylog2.indexer.searches.timeranges.TimeRange timeRange, @com.fasterxml.jackson.annotation.JsonProperty(value = "limit")
int limit, @com.fasterxml.jackson.annotation.JsonProperty(value = "offset")
int offset, @com.fasterxml.jackson.annotation.JsonProperty(value = "sorting")
@javax.annotation.Nullable
org.graylog2.indexer.searches.Sorting sorting) {
    return org.graylog2.indexer.searches.SearchesConfig.builder().query(query).filter(filter).fields(fields).range(timeRange).limit((limit > 0 ? limit : org.graylog2.indexer.searches.SearchesConfig.LIMIT)).offset(offset).sorting(sorting).build();
}