@com.is0967.menutri.controllers.RequestMapping(value = "/certify/{id}", method = RequestMethod.GET)
@com.is0967.menutri.controllers.ResponseBody
public com.is0967.menutri.dtos.ResponseDTO certify(@com.is0967.menutri.controllers.PathVariable
java.lang.Long id) {
    logger.info(("CERTIFY USER ID: " + id));
    com.is0967.menutri.entities.User user = userService.certify(id);
    if (user != null) {
        com.is0967.menutri.dtos.ResponseDTO responseDTO = new com.is0967.menutri.dtos.ResponseDTO(Constant.Code.USER_CERTIFY_SUCCESS, "certify thành công");
        responseDTO.addObject(Constant.JsonName.USER, user);
        return responseDTO;
    }else {
        return new com.is0967.menutri.dtos.ResponseDTO(Constant.Code.USER_CERTIFY_FAIL, "lỗi server hoặc user không thuộc role có thể certify");
    }
}