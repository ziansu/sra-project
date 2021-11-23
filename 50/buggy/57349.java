@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void deleteById(java.lang.Long id) {
    shelfDao.findAllByRoomId(id).forEach(this::delete);
    com.itechart.stockOnline.service.ShelfServiceImpl.logger.info("Room service: delete by id - {}. Deleted {} records", id, 1);
}