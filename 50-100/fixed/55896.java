public static void deleteUser(com.critters.dal.dto.entity.User user) throws java.io.UnsupportedEncodingException, java.security.GeneralSecurityException, javax.resource.spi.InvalidPropertyException {
    user.setIsActive(false);
    com.critters.bll.UserBLL.updateUser(user, user);
    for (com.critters.dal.dto.entity.Pet pet : user.getPets()) {
        com.critters.bll.PetBLL.abandonPet(pet);
    }
}