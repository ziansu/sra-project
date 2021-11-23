private static void parseFile() {
    com.example.utils.email.EmailTemplateTests.prepareExtendsValue(com.example.utils.email.EmailTemplateTests.valuesMap);
    try {
        java.lang.String email = com.example.utils.email.EmailTemplate.parse(new java.io.File(((com.example.utils.email.EmailTemplateTests.currentPath) + "emailTemplate.et")), com.example.utils.email.EmailTemplateTests.valuesMap);
        java.lang.System.out.println(email);
    } catch (java.io.IOException e) {
        log.error("Read email temple file error: ", e);
    }
}