protected <Z extends org.kitodo.data.database.beans.BaseBean, O extends org.kitodo.dto.BaseDTO> java.util.List<O> convertRelatedJSONObjectToDTO(org.json.simple.JSONObject jsonObject, java.lang.String key, org.kitodo.services.data.base.SearchService<Z, O> service) throws org.kitodo.data.exceptions.DataException {
    java.util.List<O> listDTO = new java.util.ArrayList<>();
    for (java.lang.Integer id : getRelatedPropertyForDTO(jsonObject, key)) {
        org.json.simple.JSONObject result = service.findById(id);
        listDTO.add(service.convertJSONObjectToDTO(result, true));
    }
    return listDTO;
}