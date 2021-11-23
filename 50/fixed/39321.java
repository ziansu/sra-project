@java.lang.SuppressWarnings(value = "unchecked")
public org.springframework.data.domain.Page<com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAddress> getAllHousingUnitAddress(java.util.UUID housingUnitId, org.springframework.data.domain.Pageable pageable) {
    com.hserv.coordinatedentry.housinginventory.domain.HousingInventory housingInventory = housingInventoryRepository.findOne(housingUnitId);
    return housingUnitAddressRepository.findByHousingInventory(housingInventory, pageable);
}