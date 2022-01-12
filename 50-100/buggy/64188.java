@java.lang.SuppressWarnings(value = "rawtypes")
@java.lang.Override
public java.lang.String execute() throws java.lang.Exception {
    java.util.Map session = com.opensymphony.xwork2.ActionContext.getContext().getSession();
    java.lang.Integer userid = ((java.lang.Integer) (session.get("userid")));
    if (userid == null) {
        addFieldError("message", "����ľ�е�¼����");
        return INPUT;
    }
    service.add_paragraph(userid, chapter_id, sequence, content, 0.0, 0);
    return SUCCESS;
}