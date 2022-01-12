@com.pastwisko.controller.PostMapping(value = "api/pastas/{id}/rating")
public org.springframework.http.ResponseEntity addRating(@com.pastwisko.controller.PathVariable
int id, @com.pastwisko.controller.RequestBody
com.pastwisko.model.Rating rating) {
    if (rating == null)
        return org.springframework.http.ResponseEntity.badRequest().body("Rating is null");
    
    com.pastwisko.model.CopyPasta copyPasta = copyPastaService.getById(id);
    if (copyPasta == null)
        return org.springframework.http.ResponseEntity.badRequest().body(("Pasta not found: " + id));
    
    copyPasta.add(rating);
    rating.setPasta(copyPasta);
    ratingService.saveOrUpdate(rating);
    return org.springframework.http.ResponseEntity.ok(copyPasta);
}