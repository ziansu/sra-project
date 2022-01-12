public static boolean isTaskCommandClassThatInfluencesKieSession(java.lang.Class<?> commandClass) {
    return org.kie.remote.client.jaxb.AcceptedClientCommands.taskCommandClassNamesThatInfluenceKieSession.contains(commandClass);
}