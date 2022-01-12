@org.springframework.web.bind.annotation.RequestMapping(value = "/labelUpdateOrInsert")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String labelUpdateOrInsert(com.apcompany.user.pojo.TLabelsRel tlabelsrel, org.springframework.ui.Model model) {
    int count = dataService.insertOrUpateTLabelsRel(tlabelsrel);
    return count > 0 ? "true" : "false";
}