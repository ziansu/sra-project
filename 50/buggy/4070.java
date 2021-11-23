@java.lang.Override
public boolean support(V input) {
    for (uk.ac.ebi.pride.validator.IValidator<V, ? extends T> validator : validators) {
        if (!(validator.support(input))) {
            return false;
        }
    }
    return true;
}