@org.springframework.web.bind.annotation.RequestMapping(value = "/delete")
@org.springframework.web.bind.annotation.ResponseBody
public com.wangzhixuan.code.Result delete(java.lang.Long id) {
    com.wangzhixuan.code.Result result = new com.wangzhixuan.code.Result();
    try {
        peopleJobService.deletePeopleJobById(id);
        result.setMsg("删除职级成功！");
        result.setSuccess(true);
        return result;
    } catch (java.lang.RuntimeException e) {
        com.wangzhixuan.controller.PeopleJobController.LOGGER.error("删除职级失败：{}", e);
        result.setMsg(e.getMessage());
        return result;
    }
}