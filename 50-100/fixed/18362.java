@java.lang.Override
public void process(java.lang.String input) {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(marcosec.training.socialnetworking.processor.InputProcessorImpl.REGEX);
    java.util.regex.Matcher matcher = pattern.matcher(input);
    matcher.matches();
    java.lang.String username = matcher.group(1);
    java.lang.String command = matcher.group(3);
    java.lang.String argument = matcher.group(5);
    java.lang.System.out.println(commandMap.get(command).execute(username, argument, java.util.Calendar.getInstance()));
}