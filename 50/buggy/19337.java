@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public java.util.Set<com.itechart.stockOnline.model.Shelf> getShelfs(java.lang.Long roomId) {
    java.util.Set<com.itechart.stockOnline.model.Shelf> shelfs = shelfDao.findAllByRoomId(roomId);
    com.itechart.stockOnline.service.ShelfServiceImpl.logger.info("Room service: getRooms() | stockId:{}. Rooms: {} records", roomId, shelfs);
    return shelfs;
}