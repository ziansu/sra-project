@org.springframework.web.bind.annotation.RequestMapping(value = "/{dateId}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<fr.easycompany.easycook.model.meals.DatedMeal> deleteDatedMeal(@org.springframework.web.bind.annotation.PathVariable(value = "dateId")
java.lang.String dateId) {
    try {
        return new org.springframework.http.ResponseEntity<fr.easycompany.easycook.model.meals.DatedMeal>(mealListService.delete(dateId), org.springframework.http.HttpStatus.OK);
    } catch (fr.easycompany.easycook.errors.exceptions.NoSuchDatedMealException e) {
        return new org.springframework.http.ResponseEntity<fr.easycompany.easycook.model.meals.DatedMeal>(org.springframework.http.HttpStatus.PRECONDITION_FAILED);
    }
}