@org.springframework.web.bind.annotation.RequestMapping(value = "edit/{blogID}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String blogUpdate(@org.springframework.web.bind.annotation.PathVariable(value = "blogID")
java.lang.Integer blogID, org.springframework.ui.ModelMap model) {
    stylish.entity.Blogs targetBlogs = blogsSB.findBlogsByID(blogID);
    java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("dd-MM-yyyy");
    java.util.Date date = targetBlogs.getPostedDate();
    java.lang.String formattedDate = dateFormat.format(date);
    model.addAttribute("formattedDate", formattedDate);
    model.addAttribute("targetBlogs", targetBlogs);
    model.addAttribute("editor1", targetBlogs.getContent());
    return "admin/pages/blog-update";
}