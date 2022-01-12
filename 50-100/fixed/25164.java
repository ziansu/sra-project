public boolean applicationExists(com.sleazyweasel.applescriptifier.Application application) {
    java.lang.String query = (((((("try\n" + ("  tell application \"Finder\"\n" + "    return application file id \"")) + (application.getIdentifier())) + "\"\n") + "  end tell\n") + "on error err_msg number err_num\n") + "  return null\n") + "end try";
    java.lang.Object result = execute(query);
    return result != null;
}