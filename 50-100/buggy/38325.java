@java.lang.Override
public void calculate(java.lang.String line, java.lang.String[] splitline, java.lang.String sampled_timeframe) {
    java.lang.String[] regexgroups = getRegexGroups();
    if ((regexgroups != null) && ((regexgroups.length) > 1))
        value = regexgroups[aggregating_field];
    else
        value = splitline[aggregating_field];
    
    if (useFilename)
        rowname = filename;
    else
        rowname = sampled_timeframe;
    
}