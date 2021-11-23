@org.smart4j.framework.mvc.annotation.Request.Post(value = "/notice/search")
public org.smart4j.framework.mvc.bean.View search(org.smart4j.framework.mvc.bean.Params params) {
    int pageNumber = params.getInt(Constant.PAGE_NUMBER);
    int pageSize = params.getInt(Constant.PAGE_SIZE);
    java.lang.String name = params.getString("param");
    org.smart4j.framework.dao.bean.Pager<org.bright.sepe.entity.Notice> noticePager = noticeService.getNoticePager(pageNumber, pageSize, name);
    return new org.smart4j.framework.mvc.bean.View("notice_list.jsp").data("noticePager", noticePager);
}