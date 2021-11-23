@org.springframework.web.bind.annotation.RequestMapping(value = "/fork/{owner}/{reponame}")
public org.bson.Document getRepoBranch(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.PathVariable(value = "reponame")
java.lang.String reponame, @org.springframework.web.bind.annotation.PathVariable(value = "owner")
java.lang.String owner) {
    return repositoryInfoService.getRepoFork(((owner + "/") + reponame));
}