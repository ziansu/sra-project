@java.lang.Override
public final boolean test(I input, O output) {
    return output == (alternateImplementation.apply(input));
}