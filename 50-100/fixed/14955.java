private static Todo parseAsFloatingTodo(java.lang.String args) {
    java.util.regex.Matcher todoMatcher = CommandAdd.REGEX_ADD_FLOATING_TODO.matcher(args);
    if (todoMatcher.matches()) {
        java.lang.String name = todoMatcher.group(CommandAdd.FIELD_NAME);
        return new Todo(name);
    }else {
        return null;
    }
}