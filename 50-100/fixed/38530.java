@org.springframework.web.bind.annotation.RequestMapping(value = "/timeline", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String showTimeline(@org.springframework.web.bind.annotation.ModelAttribute
de.hska.lkit.demo.web.model.timeline.Timeline timeline, javax.servlet.http.HttpSession session, org.springframework.ui.Model model) {
    if ((session == null) || ((session.getAttribute("username")) == null)) {
        return "redirect:./login";
    }
    java.util.List<de.hska.lkit.demo.web.model.post.Post> posts = persistency.findGlobalPosts(0, (-1));
    model.addAttribute("posts", posts);
    return "all-posts";
}