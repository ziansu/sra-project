public static void importTranslation(long projectId, long langId, java.util.Map<java.lang.String, java.lang.String> map) throws com.liferay.portal.kernel.exception.SystemException {
    java.util.List<com.company.iba.ialeditor.model.Term> termList = com.company.iba.ialeditor.service.TermLocalServiceUtil.findByProjectId(projectId);
    for (com.company.iba.ialeditor.model.Term t : termList) {
        if (map.containsKey(t.getTermName())) {
            com.company.iba.ialeditor.manageservice.ManageService.addDictionary(langId, t.getTermId(), map.get(t.getTermName()));
        }
    }
}