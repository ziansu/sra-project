@org.springframework.web.bind.annotation.RequestMapping(value = "/delete")
@org.springframework.web.bind.annotation.ResponseBody
public com.wangzhixuan.code.Result delete(java.lang.Integer id) {
    com.wangzhixuan.code.Result result = new com.wangzhixuan.code.Result();
    try {
        peopleTransferService.delete(id);
        result.setMsg("删除成功！");
        result.setSuccess(true);
        return result;
    } catch (java.lang.RuntimeException e) {
        com.wangzhixuan.controller.PeopleTransferController.LOGGER.error("删除记录失败：{}", e);
        result.setMsg(e.getMessage());
        return result;
    }
}