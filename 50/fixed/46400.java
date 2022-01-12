public void fillOrderVO(com.dajia.vo.OrderVO ov, com.dajia.domain.UserOrder order) {
    ov.userContact = userContactRepo.findOne(order.contactId);
    if (null != (ov.userContact)) {
        ov.userName = ov.userContact.user.userName;
    }
}