@java.lang.Override
public int hashCode() {
    int result = ((previousOutput) == null) ? 1 : previousOutput.hashCode();
    result = (31 * result) + ((int) ((sequence) ^ ((sequence) >>> 32)));
    result = (31 * result) + (scriptSignature.hashCode());
    return result;
}