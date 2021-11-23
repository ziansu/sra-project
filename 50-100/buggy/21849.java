private void saveGroups(org.apache.oro.text.regex.MatchResult result, java.lang.String namep, org.apache.jmeter.threads.JMeterVariables vars) {
    if (result != null) {
        for (int x = 0; x < (result.groups()); x++) {
            vars.put(((namep + "_g") + x), result.group(x));
        }
    }
}