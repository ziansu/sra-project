@org.springframework.web.bind.annotation.RequestMapping(value = "/movie/{movieId}/review", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String review(@org.springframework.web.bind.annotation.PathVariable(value = "movieId")
long movieId, @org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam(value = "movietitle")
java.lang.String movietitle, @org.springframework.web.bind.annotation.RequestParam(value = "rating")
int rating, @org.springframework.web.bind.annotation.RequestParam(value = "age")
java.lang.String age, @org.springframework.web.bind.annotation.RequestParam(value = "gender")
java.lang.String gender, @org.springframework.web.bind.annotation.RequestParam(value = "occupation")
java.lang.String occupation) {
    io.braxton.moviereviewer.models.Movie movie = repo.findOne(movieId);
    io.braxton.moviereviewer.models.Review newReview = new io.braxton.moviereviewer.models.Review(name, movietitle, rating, age, gender, occupation, movie);
    reviewRepo.save(newReview);
    return "redirect:/movie/" + movieId;
}