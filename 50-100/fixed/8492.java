public static com.example.hotel.dto.AllocationEntityDataDTO map2DTO(com.example.hotel.models.AllocationEntity allocationEntity) {
    com.example.hotel.dto.AllocationEntityDataDTO allocationEntityDataDTO = new com.example.hotel.dto.AllocationEntityDataDTO();
    allocationEntityDataDTO.setRoomID(allocationEntity.getId());
    allocationEntityDataDTO.setNumber(allocationEntity.getNumber());
    allocationEntityDataDTO.setType(allocationEntity.getType().name());
    allocationEntityDataDTO.setAvailability(allocationEntity.getAvailability());
    allocationEntityDataDTO.setCapacity(allocationEntity.getCapacity());
    allocationEntityDataDTO.setCost(allocationEntity.getPrice());
    return allocationEntityDataDTO;
}