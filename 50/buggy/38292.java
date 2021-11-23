public static com.pachimari.auth.AuthDto toAuthDto(com.pachimari.auth.AuthEntity authEntity) {
    return com.pachimari.auth.AuthDto.builder().login(authEntity.getLogin()).pwd(authEntity.getPwd()).build();
}