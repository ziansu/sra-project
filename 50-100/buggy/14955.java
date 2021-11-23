private boolean parseAsFloatingTodo(java.lang.String args) {
    java.util.regex.Matcher todoMatcher = CommandAdd.REGEX_ADD_FLOATING_TODO.matcher(args);
    if (todoMatcher.matches()) {
        java.lang.String name = todoMatcher.group(CommandAdd.FIELD_NAME);
        item = new Todo(name);
        return true;
    }else {
        return false;
    }
}