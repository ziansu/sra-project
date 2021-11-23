@org.springframework.web.bind.annotation.RequestMapping(value = "/edit")
@org.springframework.web.bind.annotation.ResponseBody
public com.wangzhixuan.code.Result edit(com.wangzhixuan.vo.PeopleVo peoplevo, @org.springframework.web.bind.annotation.RequestParam(value = "fileName", required = false)
org.springframework.web.multipart.commons.CommonsMultipartFile file) {
    com.wangzhixuan.code.Result result = new com.wangzhixuan.code.Result();
    try {
        peopleService.updatePeople(peoplevo, file);
        result.setSuccess(true);
        result.setMsg("修改成功!");
        return result;
    } catch (java.lang.Exception e) {
        com.wangzhixuan.controller.PeopleController.LOGGER.error("修改人员失败：{}", e);
        result.setMsg(e.getMessage());
        return result;
    }
}