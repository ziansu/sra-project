@org.springframework.security.access.prepost.PreAuthorize(value = "#userId == authentication.user.id")
@org.springframework.web.bind.annotation.GetMapping(value = "/stores/{userId}")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.softserve.if072.common.model.Store> getStores(@org.springframework.web.bind.annotation.PathVariable
final int userId, final javax.servlet.http.HttpServletResponse response) {
    try {
        final java.util.List<com.softserve.if072.common.model.Store> list = goShoppingService.getStoreByUserId(userId);
        com.softserve.if072.restservice.controller.GoShoppingController.LOGGER.info(java.lang.String.format("Stores of user id %d was found ", userId));
        response.setStatus(HttpServletResponse.SC_OK);
        return list;
    } catch (com.softserve.if072.restservice.exception.DataNotFoundException e) {
        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        com.softserve.if072.restservice.controller.GoShoppingController.LOGGER.error(e.getMessage(), e);
        return new java.util.ArrayList<>();
    }
}