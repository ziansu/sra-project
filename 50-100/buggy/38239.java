@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public void serialize(cc.blynk.utils.structure.TableLimitedQueue<cc.blynk.server.core.model.widgets.ui.table.Row> value, com.fasterxml.jackson.core.JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.SerializerProvider serializers) throws java.io.IOException {
    if ((value != null) && ((value.size()) > 0)) {
        cc.blynk.utils.structure.TableLimitedQueue<cc.blynk.server.core.model.widgets.ui.table.Row> clonedRows = ((cc.blynk.utils.structure.TableLimitedQueue<cc.blynk.server.core.model.widgets.ui.table.Row>) (value.clone()));
        jsonGenerator.writeStartArray();
        for (cc.blynk.server.core.model.widgets.ui.table.Row row : clonedRows) {
            jsonGenerator.writeObject(row);
        }
        jsonGenerator.writeEndArray();
    }
}