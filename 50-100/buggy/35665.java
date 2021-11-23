@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if (!(o instanceof com.espirit.moddev.cli.api.validation.Voilation)) {
        return false;
    }
    com.espirit.moddev.cli.api.validation.Voilation voilation = ((com.espirit.moddev.cli.api.validation.Voilation) (o));
    return (java.util.Objects.equals(field, voilation.field)) && (java.util.Objects.equals(message, voilation.message));
}