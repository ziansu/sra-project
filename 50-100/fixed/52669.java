@cat.udl.eps.softarch.hello.controller.RequestMapping(value = "/{id}", method = RequestMethod.POST, consumes = "multipart/form-data")
@cat.udl.eps.softarch.hello.controller.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public java.lang.String updateHTML(@cat.udl.eps.softarch.hello.controller.PathVariable(value = "id")
java.lang.Long oldSwimmerId, @javax.validation.Valid
@cat.udl.eps.softarch.hello.controller.ModelAttribute(value = "swimmer")
cat.udl.eps.softarch.hello.model.Swimmer updateSwimmer, org.springframework.validation.BindingResult binding, @cat.udl.eps.softarch.hello.controller.RequestParam
java.lang.Long groupId) throws java.io.IOException {
    if (binding.hasErrors()) {
        logger.info("Validation error: {}", binding);
        return "swimmerForm";
    }
    logger.info("Updating swimmer {}, new content is '{}'", oldSwimmerId, updateSwimmer.getSwimmerName());
    com.google.common.base.Preconditions.checkNotNull(swimmerRepository.findOne(oldSwimmerId), "Swimmer with id %s not found", oldSwimmerId);
    cat.udl.eps.softarch.hello.model.Swimmer swimmerUpdated = swimmerService.updateSwimmer(updateSwimmer, oldSwimmerId, groupId);
    return "redirect:/swimmers/" + (swimmerUpdated.getId());
}