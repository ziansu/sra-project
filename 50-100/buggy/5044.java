@org.springframework.web.bind.annotation.RequestMapping(value = "/user/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<com.app.microservice.user.User> getOneUserDetails(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) throws java.lang.Exception {
    com.app.microservice.user.User user = null;
    user = userDAO.findOne(id);
    if ((user.getAuthToken()) == 0)
        throw new java.lang.Exception("Cannot authenticate. Please login to view your details !!! ");
    
    return new org.springframework.http.ResponseEntity<com.app.microservice.user.User>(user, org.springframework.http.HttpStatus.OK);
}