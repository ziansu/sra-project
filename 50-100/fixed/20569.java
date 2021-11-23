@org.springframework.web.bind.annotation.RequestMapping(value = "/create-band")
public void createBand(javax.servlet.http.HttpSession session, @org.springframework.web.bind.annotation.RequestBody
com.theironyard.entities.Band band) throws java.lang.Exception {
    java.lang.String username = ((java.lang.String) (session.getAttribute("username")));
    com.theironyard.entities.User user = users.findOneByUsername(username);
    if (user == null) {
        throw new java.lang.Exception("Not logged in.");
    }
    bands.save(band);
}