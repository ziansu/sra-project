@org.springframework.web.bind.annotation.RequestMapping(path = "/featuredMovies", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<movie.app.businessobjects.MovieBO> featuredMovies(@javax.websocket.server.PathParam(value = "limit")
int limit) {
    java.util.List<movie.app.businessobjects.MovieBO> movieBOs = movieService.getFeaturedMovies(limit);
    return movieBOs;
}