@java.lang.Override
public java.lang.String toCode() throws com.ardublock.translator.block.exception.SocketNullException, com.ardublock.translator.block.exception.SubroutineNotDeclaredException {
    java.lang.String ret = "analogRead(A";
    com.ardublock.translator.block.TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
    ret = ret + (translatorBlock.toCode());
    ret = ret + ") > 1000";
    return ((codePrefix) + ret) + (codeSuffix);
}