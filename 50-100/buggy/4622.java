com.forgerock.opendj.cli.ArgumentGroup getStandardGroup(final com.forgerock.opendj.cli.Argument argument) {
    com.forgerock.opendj.cli.ArgumentGroup group;
    if (isInputOutputArgument(argument)) {
        group = ioArgGroup;
    }else
        if (isGeneralArgument(argument)) {
            group = generalArgGroup;
        }else
            if (isLdapConnectionArgument(argument)) {
                group = ldapArgGroup;
            }else {
                group = defaultArgGroup;
            }
        
    
    return group;
}