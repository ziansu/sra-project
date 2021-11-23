public void changeSlotState(java.lang.Long stationId, de.rwth.idsg.bikeman.web.rest.dto.modify.ChangeStationOperationStateDTO dto) throws de.rwth.idsg.bikeman.web.rest.exception.DatabaseException {
    de.rwth.idsg.bikeman.web.rest.dto.modify.ChangeStationOperationStateDTO changeDTO = new de.rwth.idsg.bikeman.web.rest.dto.modify.ChangeStationOperationStateDTO();
    changeDTO.setState(dto.getState());
    changeDTO.setSlotPosition(dto.getSlotPosition());
    java.lang.String endpointAddress = stationRepository.getEndpointAddress(stationId);
    boolean success = stationClient.changeOperationState(endpointAddress, changeDTO);
    if (success) {
        stationRepository.changeSlotState(stationId, dto.getSlotPosition(), dto.getState());
    }
}