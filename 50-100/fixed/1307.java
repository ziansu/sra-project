@org.springframework.web.bind.annotation.RequestMapping(value = "/json/experiments/{experimentAccession}", params = { "type=MICROARRAY_ANY" })
public java.lang.String showGeneProfilesData(@org.springframework.web.bind.annotation.ModelAttribute(value = "preferences")
@javax.validation.Valid
uk.ac.ebi.atlas.web.MicroarrayRequestPreferences preferences, @org.springframework.web.bind.annotation.PathVariable
java.lang.String experimentAccession, @org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.String accessKey, org.springframework.validation.BindingResult result, org.springframework.ui.Model model, javax.servlet.http.HttpServletResponse response) {
    super.populateModelWithHeatmapData(((uk.ac.ebi.atlas.model.differential.microarray.MicroarrayExperiment) (experimentTrader.getExperiment(experimentAccession, accessKey))), preferences, result, model);
    response.setContentType(MediaType.APPLICATION_JSON_VALUE);
    return "heatmap-data";
}