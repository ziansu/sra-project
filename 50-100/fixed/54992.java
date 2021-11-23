public static void updateDictionary(long langId, long termId, java.lang.String translation) throws com.company.iba.ialeditor.NoSuchDictionaryException, com.liferay.portal.kernel.exception.SystemException {
    com.company.iba.ialeditor.model.Dictionary d = com.company.iba.ialeditor.service.DictionaryLocalServiceUtil.findByLangIdTermId(langId, termId);
    if (translation.trim().equals("")) {
        com.company.iba.ialeditor.service.DictionaryLocalServiceUtil.deleteDictionary(d);
    }else {
        d.setTranslation(translation.trim());
        com.company.iba.ialeditor.service.DictionaryLocalServiceUtil.updateDictionary(d);
    }
}