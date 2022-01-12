com.forgerock.opendj.cli.ArgumentGroup getStandardGroup(final com.forgerock.opendj.cli.Argument argument) {
    if (isInputOutputArgument(argument)) {
        return ioArgGroup;
    }else
        if (isGeneralArgument(argument)) {
            return generalArgGroup;
        }else
            if (isLdapConnectionArgument(argument)) {
                return ldapArgGroup;
            }else {
                return defaultArgGroup;
            }
        
    
}