public static com.zhzx.uip.commons.module.ResponseVo buildFailResponse(com.zhzx.uip.commons.enums.ErrorEnum errorEnum, java.lang.String msg) {
    com.zhzx.uip.commons.module.ResponseVo responseVo = new com.zhzx.uip.commons.module.ResponseVo();
    responseVo.setCode(errorEnum.getErrorCode());
    responseVo.setMessage((msg == null ? errorEnum.getErrorMsg() : msg));
    responseVo.setSuccess(false);
    return responseVo;
}