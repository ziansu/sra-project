@org.springframework.web.bind.annotation.RequestMapping(value = "/addExample")
@org.springframework.web.bind.annotation.ResponseBody
@javax.transaction.Transactional
public com.course.work.prediction.planning.api.dto.SuccessWrapper<com.course.work.prediction.planning.api.dto.ExampleDto> addExample(@org.springframework.web.bind.annotation.RequestBody
com.course.work.prediction.planning.api.dto.AddExampleDto exampleDto, java.lang.String token) {
    com.course.work.prediction.planning.api.controller.FreeUserController.log.info(((("/addExample: userId= " + (tokens.get(token).getUserId())) + " exampleDto= ") + exampleDto));
    if (!(addExampleValidator.isValid(exampleDto, token)))
        throw new java.lang.IllegalArgumentException("Invalid data");
    
    return new com.course.work.prediction.planning.api.dto.SuccessWrapper<com.course.work.prediction.planning.api.dto.ExampleDto>(new com.course.work.prediction.planning.api.dto.ExampleDto(exampleService.create(exampleDto)));
}