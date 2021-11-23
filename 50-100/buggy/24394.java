public static com.zhzx.uip.commons.module.ResponseVo buildFailResponse(com.zhzx.uip.commons.enums.ErrorEnum errorEnum) {
    com.zhzx.uip.commons.module.ResponseVo responseVo = new com.zhzx.uip.commons.module.ResponseVo();
    responseVo.setCode(errorEnum.getErrorCode());
    responseVo.setMessage(errorEnum.getErrorMsg());
    responseVo.setSuccess(false);
    return responseVo;
}