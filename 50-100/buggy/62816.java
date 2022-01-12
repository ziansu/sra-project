@java.lang.Override
public void savePartnerDetails(com.rjn.model.VendorProfile partnerDetails) {
    partnerDetailsDao.savePartnerDetails(partnerDetails);
    if (((partnerDetails.getId()) == null) || ("".equals(partnerDetails.getId()))) {
        com.rjn.model.Account account = new com.rjn.model.Account();
        account.setMy_user_name(partnerDetails.getEmail());
        account.setPassword(partnerDetails.getPassword());
        account.setReg_id(partnerDetails.getId());
        accountDao.save(account, Constant.ROLE_PARTNER);
    }
}