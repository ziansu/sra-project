@java.lang.Override
public ru.nsu.ccfit.saltanova.ExtensionFilter serialize(java.lang.String line) throws ru.nsu.ccfit.saltanova.FilterSerializerException {
    if ((line.length()) < 2) {
        throw new ru.nsu.ccfit.saltanova.FilterSerializerException("String with prefix '<' is too short");
    }
    return new ru.nsu.ccfit.saltanova.ExtensionFilter(line.substring(1));
}