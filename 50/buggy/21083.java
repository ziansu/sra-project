@java.lang.Override
public prompto.value.IValue readJSONValue(prompto.runtime.Context context, com.fasterxml.jackson.databind.JsonNode value, java.util.Map<java.lang.String, byte[]> parts) {
    prompto.intrinsic.PromptoVersion version = prompto.intrinsic.PromptoVersion.parse(value.get("value").asText());
    return new prompto.value.Version(version);
}