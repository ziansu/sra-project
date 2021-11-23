@java.lang.Override
public void convertInput() {
    java.lang.String input = com.vaynberg.wicket.select2.Select2Choice.getWebRequest().getRequestParameters().getParameterValue(com.vaynberg.wicket.select2.Select2Choice.getInputName()).toString();
    if (org.apache.wicket.util.string.Strings.isEmpty(input)) {
        com.vaynberg.wicket.select2.Select2Choice.setConvertedInput(null);
    }else {
        setConvertedInput(com.vaynberg.wicket.select2.Select2Choice.getProvider().toChoices(java.util.Collections.singleton(input)).iterator().next());
    }
}