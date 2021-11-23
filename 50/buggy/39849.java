public void updateImgUrl(com.tvntd.lib.ObjectId id) {
    profile.setUserImgUrl(objStore.imgObjUri(id, com.tvntd.service.api.IProfileService.ProfileDTO.s_baseUri));
}