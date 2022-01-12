@java.lang.SuppressWarnings(value = "unchecked")
public play.mvc.Result renderUpdateEntryForm(java.lang.String hash) {
    uk.gov.openregister.domain.Record record = store.findByHash(hash).get().getRecord();
    java.util.Map params = uk.gov.openregister.JsonObjectMapper.convert(record.getEntry().toString(), java.util.Map.class);
    return ok(views.html.updateEntry.render(registerName, fields, convertToMapOfListValues(params), java.util.Collections.emptyMap(), hash));
}