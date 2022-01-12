public void updateStation(de.rwth.idsg.bikeman.web.rest.dto.modify.CreateEditStationDTO dto) throws de.rwth.idsg.bikeman.web.rest.exception.DatabaseException {
    de.rwth.idsg.bikeman.web.rest.dto.modify.ChangeStationOperationStateDTO changeDTO = new de.rwth.idsg.bikeman.web.rest.dto.modify.ChangeStationOperationStateDTO();
    changeDTO.setState(dto.getState());
    changeDTO.setSlotPosition((-1));
    java.lang.String endpointAddress = stationRepository.getEndpointAddress(dto.getStationId());
    stationClient.changeOperationState(endpointAddress, changeDTO);
    stationRepository.update(dto);
}