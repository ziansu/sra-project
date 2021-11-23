private static void copy(com.thoughtworks.go.config.update.Validatable from, com.thoughtworks.go.config.update.Validatable to) {
    to.errors().addAll(from.errors());
}