@java.lang.Override
public nl.tudelft.ti2806.riverrush.domain.event.Event deserialize(final java.util.Map<java.lang.String, java.lang.String> keyValuePairs) {
    super.deserialize(keyValuePairs);
    if (keyValuePairs.containsKey("location")) {
        this.location = nl.tudelft.ti2806.riverrush.domain.event.Direction.valueOf(keyValuePairs.get("location").toUpperCase());
    }else {
        throw new nl.tudelft.ti2806.riverrush.network.protocol.InvalidProtocolException("Does not contain all the keys");
    }
    return this;
}