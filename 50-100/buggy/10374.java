@java.lang.Override
@javax.transaction.Transactional
public edu.hs.bremen.model.dto.OrderDto deleteBasketEntry(java.lang.String userUuid, edu.hs.bremen.model.dto.BasketEntryDto basketEntryDto) {
    final edu.hs.bremen.model.UserEntity userEntity = userManager.getUser(userUuid);
    final edu.hs.bremen.model.BasketEntryEntity basketEntryEntity = basketManager.getUpdatedBasketEntry(basketEntryDto, java.lang.Boolean.TRUE);
    if ((basketEntryEntity.getProductCount()) <= 0) {
        basketManager.deleteBasketEntryFromOrder(userEntity, basketEntryEntity);
    }
    return edu.hs.bremen.model.dto.OrderDto.fromOrder(orderManager.getOrder(userEntity));
}