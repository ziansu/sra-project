@com.giants3.hd.server.controller.RequestMapping(value = "/saveList", method = RequestMethod.POST)
@org.springframework.transaction.annotation.Transactional
@com.giants3.hd.server.controller.ResponseBody
public com.giants3.hd.utils.RemoteData<java.lang.Void> saveList(@com.giants3.hd.server.controller.RequestBody
java.util.List<com.giants3.hd.server.controller.Material> materials) {
    for (com.giants3.hd.server.controller.Material material : materials) {
        com.giants3.hd.server.controller.Material oldData = materialRepository.findFirstByCodeEquals(material.code);
        if (oldData == null) {
            material.id = -1;
        }else {
            material.id = oldData.id;
        }
        save(material);
    }
    return wrapData(new java.util.ArrayList<java.lang.Void>());
}