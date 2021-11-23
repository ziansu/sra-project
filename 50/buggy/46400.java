public void fillOrderVO(com.dajia.vo.OrderVO ov, com.dajia.domain.UserOrder order) {
    ov.userContact = userContactRepo.findOne(order.contactId);
    ov.userName = ov.userContact.user.userName;
}