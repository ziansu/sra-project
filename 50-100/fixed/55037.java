private static void parseString() {
    com.example.utils.email.EmailTemplateTests.prepareExtendsValue(com.example.utils.email.EmailTemplateTests.valuesMap);
    java.lang.StringBuilder templateStringBuilder = new java.lang.StringBuilder();
    templateStringBuilder.append("Hello {called} {userName} :)\n\n");
    templateStringBuilder.append("    Your birthday {birthday} is coming!\n");
    templateStringBuilder.append("You are {sex}, and {age} years old\n");
    templateStringBuilder.append("{separator}\n");
    templateStringBuilder.append("{introduction}\n");
    templateStringBuilder.append("{separator}\n");
    templateStringBuilder.append("{contact}\n");
    java.lang.System.out.println(com.example.utils.email.EmailTemplate.parse(templateStringBuilder.toString(), com.example.utils.email.EmailTemplateTests.valuesMap));
}