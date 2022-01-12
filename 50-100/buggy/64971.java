@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.Map<java.lang.String, java.lang.Object> getChord() {
    photoService.downloadPhoto(java.lang.String.valueOf(18000));
    com.tuimm.result.Result result = new com.tuimm.result.Result();
    return com.google.common.collect.ImmutableMap.<java.lang.String, java.lang.Object>builder().put("data", result).build();
}