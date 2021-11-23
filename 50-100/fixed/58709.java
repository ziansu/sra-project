private com.woyao.admin.dto.product.ShopDTO getCurrentShop() {
    long profileId = com.woyao.security.SelfSecurityUtils.getCurrentProfile().getId();
    java.util.Map<java.lang.String, java.lang.Object> paramMap = new java.util.HashMap<>();
    paramMap.put("profileId", profileId);
    com.woyao.domain.Shop currentShop = this.commonDao.queryUnique("from Shop where managerProfileId = :profileId", paramMap);
    if (currentShop == null) {
        throw new java.lang.IllegalStateException();
    }
    com.woyao.admin.dto.product.ShopDTO dto = shopAdminService.get(currentShop.getId(), true);
    dto.setManagerPwd(null);
    return dto;
}