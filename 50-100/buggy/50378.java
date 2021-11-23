@java.lang.Override
public org.springframework.http.ResponseEntity<java.util.List<ch.heigvd.gamification.api.dto.PointScale>> findUserPointScales(@io.swagger.annotations.ApiParam(value = "ID of user", required = true)
@org.springframework.web.bind.annotation.PathVariable(value = "userId")
java.lang.Long userId, @io.swagger.annotations.ApiParam(value = "token to be passed as a header", required = true)
@org.springframework.web.bind.annotation.RequestHeader(value = "token", required = true)
java.lang.String token) {
    java.util.List<ch.heigvd.gamification.api.dto.PointScale> pointscales = new java.util.ArrayList<>();
    java.lang.String name = ch.heigvd.gamification.utils.JWTutils.getAppNameInToken(token);
    if (name == null)
        return new org.springframework.http.ResponseEntity(new java.util.ArrayList<>(), org.springframework.http.HttpStatus.BAD_REQUEST);
    
    ch.heigvd.gamification.database.model.Application application = applicationRepository.findByName(name);
    java.util.List<java.lang.Object[]> userPointScales = userPointScaleRepository.findSumPointScalePerUser(userId);
}