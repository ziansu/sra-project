@edu.ynu.travel.controller.complaint.RequestMapping(value = "/complaints/{cid}", method = RequestMethod.POST)
public edu.ynu.travel.message.common.SimpleResponse verifyComplaint(@edu.ynu.travel.controller.complaint.PathVariable
int cid, @edu.ynu.travel.controller.complaint.RequestBody
java.lang.String status) {
    if ((status.equals("处理中")) || (status.equals("审核被驳"))) {
        int i = complaintService.verifyComplaint(cid, status);
        return i == 1 ? new edu.ynu.travel.message.common.SimpleResponse("审核成功", "success") : new edu.ynu.travel.message.common.SimpleResponse("审核失败", "fail");
    }else {
        return new edu.ynu.travel.message.common.SimpleResponse("传入参数有误", "error");
    }
}