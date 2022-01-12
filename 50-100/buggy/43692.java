@io.swagger.annotations.ApiOperation(value = "Get mutation signatures for given samples/patients and genetic profile id.", nickname = "getMutationSignatures", notes = "")
@org.springframework.transaction.annotation.Transactional
@org.mskcc.cbio.portal.web.api.RequestMapping(value = "/mutationsignatures", method = { RequestMethod.GET , RequestMethod.POST })
@org.mskcc.cbio.portal.web.api.ResponseBody
public java.util.List<org.cbioportal.model.MutationSignature> getMutationSignatures(@org.mskcc.cbio.portal.web.api.RequestParam(required = true)
java.lang.String genetic_profile_id, @org.mskcc.cbio.portal.web.api.RequestParam(required = true)
int context_size, @org.mskcc.cbio.portal.web.api.RequestParam(required = false)
java.util.List<java.lang.String> sample_ids, @org.mskcc.cbio.portal.web.api.RequestParam(required = false)
java.util.List<java.lang.String> patient_ids) {
    if (sample_ids != null) {
        return service.getSampleMutationSignatures(genetic_profile_id, sample_ids, context_size);
    }else
        if (patient_ids != null) {
            return service.getPatientMutationSignatures(genetic_profile_id, patient_ids, context_size);
        }else {
            return service.getAllSampleMutationSignatures(genetic_profile_id, context_size);
        }
    
}