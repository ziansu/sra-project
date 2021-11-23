@java.lang.Override
public com.alliander.osgp.adapter.ws.schema.smartmetering.common.ProfileEntryValue convert(final com.alliander.osgp.adapter.ws.schema.smartmetering.common.ProfileEntryValue source, final ma.glasnost.orika.metadata.Type<? extends com.alliander.osgp.adapter.ws.schema.smartmetering.common.ProfileEntryValue> destinationType) {
    final com.alliander.osgp.adapter.ws.schema.smartmetering.common.ProfileEntryValue result = new com.alliander.osgp.adapter.ws.schema.smartmetering.common.ProfileEntryValue();
    if ((source.getValue()) instanceof java.util.Date) {
        result.getStringValueOrDateValueOrFloatValue().add(com.alliander.osgp.adapter.ws.smartmetering.application.mapping.DateConverter.createXMLGregorianCalendar(((java.util.Date) (source.getValue()))));
    }else {
        result.getStringValueOrDateValueOrFloatValue().add(source.getValue());
    }
    return result;
}