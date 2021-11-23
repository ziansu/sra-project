private java.lang.String clean(java.lang.String definitionText) {
    return definitionText.replace(org.kframework.kore.convertors.BaseTest.COPYRIGHT_HEADER, "").replaceAll(" *\n", "\n").trim();
}