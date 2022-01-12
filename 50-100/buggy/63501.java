@java.lang.Override
public int hashCode() {
    int result = ((int) ((id) ^ ((id) >>> 32)));
    result = (31 * result) + (englishTranscript.hashCode());
    return result;
}