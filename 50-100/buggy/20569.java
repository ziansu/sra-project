@org.springframework.web.bind.annotation.RequestMapping(value = "/create-band")
public void createBand(javax.servlet.http.HttpSession session, java.lang.String name, java.lang.String location, java.lang.String genre) throws java.lang.Exception {
    java.lang.String username = ((java.lang.String) (session.getAttribute("username")));
    com.theironyard.entities.User user = users.findOneByUsername(username);
    if (user == null) {
        throw new java.lang.Exception("Not logged in.");
    }
    com.theironyard.entities.Band band = new com.theironyard.entities.Band();
    band.name = name;
    band.location = location;
    band.genre = genre;
    band.user = user;
    bands.save(band);
}