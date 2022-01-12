@org.springframework.web.bind.annotation.RequestMapping(value = "/{userId}/{courseId}/{commentId}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String postOrUpdateComment(@org.springframework.web.bind.annotation.PathVariable
long userId, @org.springframework.web.bind.annotation.PathVariable
long courseId, @org.springframework.web.bind.annotation.PathVariable
long commentId, @org.springframework.web.bind.annotation.RequestParam
java.lang.String comment) {
    wadp.domain.Comment com = commentService.findCommentById(commentId);
    commentService.updateComment(com, comment);
    wadp.domain.User user = userService.getAuthenticatedUser();
    if ("teacher".equals(user.getUserRole())) {
        return ((("redirect:/course/" + courseId) + "/") + userId) + "#comments";
    }
    return ("redirect:/course/" + courseId) + "#comments";
}