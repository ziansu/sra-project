@org.junit.Test
public void testNotEmpty() {
    com.liferay.dynamic.data.mapping.model.DDMFormField ddmFormField = com.liferay.dynamic.data.mapping.test.util.DDMFormTestUtil.createDDMFormField("documentLibrary", "Document Library", "document_library", "string", false, false, true);
    com.liferay.portal.kernel.util.StringBundler sb = new com.liferay.portal.kernel.util.StringBundler();
    sb.append("\"{\"groupId\":\"32964\",");
    sb.append("\"title\":\"Welcome to Liferay Forms!\",");
    sb.append("\"type\":\"document\",");
    sb.append("\"uuid\":\"f85c8ae1-603b-04eb-1132-12645d73519e\"}\"");
    com.liferay.dynamic.data.mapping.storage.DDMFormFieldValue ddmFormFieldValue = com.liferay.dynamic.data.mapping.test.util.DDMFormValuesTestUtil.createDDMFormFieldValue("documentLibrary", new com.liferay.dynamic.data.mapping.model.UnlocalizedValue(sb.toString()));
    org.junit.Assert.assertFalse(_documentLibraryDDMFormFieldValueAccessor.isEmpty(ddmFormFieldValue, LocaleUtil.US));
}