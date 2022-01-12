private com.alliander.osgp.dto.valueobjects.smartmetering.AmrProfileStatusCodeDto readAmrProfileStatusCode(final org.openmuc.jdlms.datatypes.DataObject amrProfileStatusData) throws org.osgp.adapter.protocol.dlms.exceptions.ProtocolAdapterException {
    if (!(amrProfileStatusData.isNumber())) {
        throw new org.osgp.adapter.protocol.dlms.exceptions.ProtocolAdapterException("Could not read AMR profile register data. Invalid data type.");
    }
    final java.util.Set<com.alliander.osgp.dto.valueobjects.smartmetering.AmrProfileStatusCodeFlagDto> flags = this.amrProfileStatusCodeHelperService.toAmrProfileStatusCodeFlags(((java.lang.Number) (amrProfileStatusData.value())));
    return new com.alliander.osgp.dto.valueobjects.smartmetering.AmrProfileStatusCodeDto(flags);
}