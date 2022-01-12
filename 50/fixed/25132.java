@java.lang.Override
public java.lang.String apply(org.glassfish.jersey.server.validation.ValidationError input) {
    return ((input.getPath()) + " ") + (input.getMessage());
}