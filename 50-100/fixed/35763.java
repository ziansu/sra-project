public static void main(java.lang.String[] args) {
    for (java.lang.String arg : args) {
        java.lang.String[] splitArg = arg.split(de.hpi.bpt.argos.core.Application.PROPERTY_SEPARATOR);
        if ((splitArg.length) != (de.hpi.bpt.argos.core.Application.ARG_SPLIT_LENGTH)) {
            continue;
        }
        de.hpi.bpt.argos.properties.PropertyEditorImpl.getInstance().setProperty(splitArg[0], splitArg[1]);
    }
    new de.hpi.bpt.argos.core.ArgosImpl().start();
}