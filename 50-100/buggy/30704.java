private boolean canOperateOnUsernameGifts(java.lang.String username) {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(username)) {
        com.qprogramming.gifts.account.Account giftOwner = accountService.findByUsername(username);
        if (giftOwner == null) {
            return false;
        }
        com.qprogramming.gifts.account.family.Family family = familyService.getFamily(giftOwner);
        return (family == null) || (family.getAdmins().contains(com.qprogramming.gifts.support.Utils.getCurrentAccount()));
    }
    return false;
}