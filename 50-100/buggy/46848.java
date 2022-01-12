@com.siemens.resources.GET
public java.util.List<com.siemens.beans.MessageBean> getMessages(@com.siemens.resources.BeanParam
com.siemens.beans.MessageFilterBean messageFilterBean) {
    if ((messageFilterBean.getYear()) > 0)
        return messageService.getAllMessagesForYear(messageFilterBean.getYear());
    
    if (((messageFilterBean.getStart()) >= 0) && ((messageFilterBean.getSize()) >= 0)) {
        return messageService.getAllMessagesPaginated(messageFilterBean.getStart(), messageFilterBean.getSize());
    }
    return messageService.getAllMessages();
}