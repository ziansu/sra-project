@org.springframework.web.bind.annotation.RequestMapping(value = "/getPostById", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<project3.objectcontainer.PostContainer> getPost(@org.springframework.web.bind.annotation.RequestParam(value = "id")
int id) {
    java.lang.System.out.println(("id is  " + id));
    project3.dto.ForumPost post = service.getPostById(id);
    project3.objectcontainer.PostContainer pos = new project3.objectcontainer.PostContainer();
    return new org.springframework.http.ResponseEntity<project3.objectcontainer.PostContainer>(pos, org.springframework.http.HttpStatus.OK);
}