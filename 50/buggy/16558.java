@org.springframework.web.bind.annotation.RequestMapping(value = "mobile/circle/create")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String save(java.lang.String phone, com.ezb.jdb.model.Circle circle, java.lang.String uids) {
    return circleServiceImpl.create(phone, circle, uids);
}