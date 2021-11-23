@org.springframework.web.bind.annotation.RequestMapping(value = "/saveComment")
public void register(@org.springframework.web.bind.annotation.RequestParam(value = "content")
java.lang.String content, @org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam(value = "blogid")
int id) {
    myBlog.Comment c = new myBlog.Comment(new java.sql.Timestamp(java.lang.System.currentTimeMillis()), content, name, id);
    commentRepo.save(c);
}