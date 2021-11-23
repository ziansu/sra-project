@java.lang.Override
@javax.transaction.Transactional
public edu.hs.bremen.model.dto.OrderDto linkBasketEntry(java.lang.String userUuid, edu.hs.bremen.model.dto.BasketEntryDto basketEntryDto) {
    final edu.hs.bremen.model.UserEntity userEntity = userManager.getUser(userUuid);
    final edu.hs.bremen.model.BasketEntryEntity basketEntryEntity = basketManager.getUpdatedBasketEntry(basketEntryDto, java.lang.Boolean.FALSE);
    return edu.hs.bremen.model.dto.OrderDto.fromOrder(basketManager.addBasketEntryToOrder(userEntity, basketEntryEntity));
}