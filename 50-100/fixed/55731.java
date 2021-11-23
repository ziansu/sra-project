@org.springframework.web.bind.annotation.RequestMapping(value = "joined", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String joined(java.lang.Integer albumId) {
    com.era.common.model.User user = com.era.education.util.Client.getUser();
    if (user != null) {
        java.lang.Integer userId = user.getId();
        com.era.education.controller.Learning learning = learningService.getDetailByAlbumId(albumId, userId);
        if ((learning != null) && ((learning.getId()) != null)) {
            return com.era.common.util.Response.success(true);
        }else {
            return com.era.common.util.Response.success(false);
        }
    }else {
        return com.era.common.util.Response.success(false);
    }
}