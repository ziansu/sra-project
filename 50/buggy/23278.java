@java.lang.Override
public boolean write(com.fasterxml.jackson.core.JsonGenerator generator) throws java.io.IOException {
    generator.writeNumber(jp.hazuki.yuzubrowser.pattern.action.BLOCK);
    generator.writeNull();
    return true;
}