@java.lang.Override
public void convertInput() {
    java.lang.String input = com.vaynberg.wicket.select2.Select2MultiChoice.getWebRequest().getRequestParameters().getParameterValue(com.vaynberg.wicket.select2.Select2MultiChoice.getInputName()).toString();
    final java.util.Collection<T> choices;
    if (org.apache.wicket.util.string.Strings.isEmpty(input)) {
        choices = new java.util.ArrayList<T>();
    }else {
        java.util.List<java.lang.String> ids = com.vaynberg.wicket.select2.Select2MultiChoice.splitInput(input);
        choices = com.vaynberg.wicket.select2.Select2MultiChoice.getProvider().toChoices(ids);
    }
    com.vaynberg.wicket.select2.Select2MultiChoice.setConvertedInput(choices);
}