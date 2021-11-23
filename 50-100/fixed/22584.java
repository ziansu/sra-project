public static void loadFromMap(com.sitewhere.rest.model.device.event.DeviceCommandResponse event, java.util.Map<java.lang.String, java.lang.Object> values) throws com.sitewhere.spi.SiteWhereException {
    event.setEventType(DeviceEventType.CommandResponse);
    event.setOriginatingEventId(com.sitewhere.influx.device.InfluxDbDeviceEvent.find(values, com.sitewhere.influx.device.InfluxDbDeviceCommandResponse.RSP_ORIGINATING_EVENT_ID));
    event.setResponseEventId(com.sitewhere.influx.device.InfluxDbDeviceEvent.find(values, com.sitewhere.influx.device.InfluxDbDeviceCommandResponse.RSP_RESPONSE_EVENT_ID, true));
    event.setResponse(com.sitewhere.influx.device.InfluxDbDeviceEvent.find(values, com.sitewhere.influx.device.InfluxDbDeviceCommandResponse.RSP_RESPONSE, true));
    com.sitewhere.influx.device.InfluxDbDeviceEvent.loadFromMap(event, values);
}