public java.lang.Object exec(java.util.List arguments) throws freemarker.template.TemplateModelException {
    if ((arguments.size()) < 1) {
        throw new freemarker.template.TemplateModelException("Invalid parameters to the message method. This method takes one or more parameters like this: message(key) or message(key, values...)");
    }
    java.lang.String key = arguments.get(0).toString();
    return messageProvider.getMessage(key, arguments.subList(1, arguments.size()).toArray());
}