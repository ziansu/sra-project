@org.springframework.web.bind.annotation.RequestMapping(value = "/add", method = org.springframework.web.bind.annotation.RequestMethod.POST, headers = "Accept=application/json")
@org.springframework.web.bind.annotation.ResponseBody
public com.wangzhixuan.code.Result add(com.wangzhixuan.vo.PeopleVo peoplevo, @org.springframework.web.bind.annotation.RequestParam(value = "fileName", required = false)
org.springframework.web.multipart.commons.CommonsMultipartFile file) {
    com.wangzhixuan.code.Result result = new com.wangzhixuan.code.Result();
    try {
        peopleService.addPeople(peoplevo, file);
        result.setSuccess(true);
        result.setMsg("添加成功");
        return result;
    } catch (java.lang.Exception e) {
        com.wangzhixuan.controller.PeopleController.LOGGER.error("添加用户失败：{}", e);
        result.setMsg(e.getMessage());
        return result;
    }
}