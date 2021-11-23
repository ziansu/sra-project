public static com.jakduk.api.model.embedded.CommonWriter getCommonWriter() {
    com.jakduk.api.restcontroller.vo.user.AuthUserProfile authUserProfile = com.jakduk.api.common.util.AuthUtils.getAuthUserProfile();
    if (java.util.Objects.nonNull(authUserProfile)) {
        return com.jakduk.api.model.embedded.CommonWriter.builder().userId(authUserProfile.getId()).username(authUserProfile.getUsername()).providerId(authUserProfile.getProviderId()).picture(authUserProfile.getPicture()).build();
    }else {
        throw new com.jakduk.api.exception.ServiceException(com.jakduk.api.exception.ServiceError.NOT_FOUND_USER);
    }
}