@org.springframework.web.bind.annotation.RequestMapping(value = "/title/{title}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<org.molsbee.movie.model.omdb.TitleResponse> getMovieByTitle(@org.springframework.web.bind.annotation.PathVariable(value = "title")
java.lang.String title) {
    org.molsbee.movie.model.omdb.TitleResponse omdbResponse = omdbResponse = movieService.getMovieByTitle(title);
    return new org.springframework.http.ResponseEntity(omdbResponse, org.springframework.http.HttpStatus.OK);
}