private static void copy(com.thoughtworks.go.config.update.Validatable from, com.thoughtworks.go.config.update.Validatable to) {
    if ((from == null) || (to == null))
        return ;
    
    to.errors().addAll(from.errors());
}