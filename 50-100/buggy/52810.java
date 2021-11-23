public static void saveToBuilder(com.sitewhere.rest.model.device.event.DeviceCommandResponse event, org.influxdb.dto.Point.Builder builder) throws com.sitewhere.spi.SiteWhereException {
    builder.tag(com.sitewhere.influx.device.InfluxDbDeviceCommandResponse.RSP_ORIGINATING_EVENT_ID, event.getOriginatingEventId());
    builder.tag(com.sitewhere.influx.device.InfluxDbDeviceCommandResponse.RSP_RESPONSE_EVENT_ID, event.getResponseEventId());
    builder.tag(com.sitewhere.influx.device.InfluxDbDeviceCommandResponse.RSP_RESPONSE, event.getResponse());
    com.sitewhere.influx.device.InfluxDbDeviceEvent.saveToBuilder(event, builder);
}