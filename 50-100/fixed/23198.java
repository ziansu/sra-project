@org.springframework.web.bind.annotation.RequestMapping(value = { "/chat/chatterList" }, method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public com.snowm.utils.query.PaginationBean<com.woyao.customer.dto.ChatterDTO> listChatter(com.woyao.customer.dto.ChatterPaginationQueryRequest request) {
    long chatRoomId = this.mobileService.getChatRoom(request.getShopId()).getId();
    com.snowm.utils.query.PaginationBean<com.woyao.customer.dto.ChatterDTO> rs = this.chatService.listOnlineChatters(chatRoomId, request.getGender(), request.getPageNumber(), request.getPageSize());
    rs.getPageNumber();
    return rs;
}