@org.smart4j.framework.mvc.annotation.Request.Get(value = "/notices")
public org.smart4j.framework.mvc.bean.View index() {
    int pageNumber = 1;
    int pageSize = org.bright.sepe.Tool.getPageSize("notice_pager");
    java.lang.String name = "";
    org.smart4j.framework.dao.bean.Pager<org.bright.sepe.entity.Notice> noticePager = noticeService.getNoticePager(pageNumber, pageSize, name);
    return new org.smart4j.framework.mvc.bean.View("notice.jsp").data("noticePager", noticePager);
}