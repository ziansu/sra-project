@java.lang.Override
public com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodicMeterReadsGasResponseData convert(final com.alliander.osgp.domain.core.valueobjects.smartmetering.PeriodicMeterReadsContainerGas source, final ma.glasnost.orika.metadata.Type<? extends com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodicMeterReadsGasResponseData> destinationType) {
    final com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodicMeterReadsGasResponseData periodicMeterReadsResponse = new com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodicMeterReadsGasResponseData();
    periodicMeterReadsResponse.setPeriodType(com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodType.valueOf(source.getPeriodType().name()));
    final java.util.List<com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodicMeterReadsGas> periodicMeterReads = periodicMeterReadsResponse.getPeriodicMeterReadsGas();
    for (final com.alliander.osgp.adapter.ws.schema.smartmetering.monitoring.PeriodicMeterReadsGas m : source.getPeriodicMeterReadsGas()) {
        periodicMeterReads.add(this.convert(m));
    }
    return periodicMeterReadsResponse;
}