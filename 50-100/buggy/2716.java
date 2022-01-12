protected java.lang.String generateCodeUsingNonNumberBlock(com.ardublock.translator.block.TranslatorBlock translatorBlock) throws com.ardublock.translator.block.exception.SocketNullException, com.ardublock.translator.block.exception.SubroutineNotDeclaredException {
    translator.addDefinitionCommand(com.ardublock.translator.block.DigitalInputBlock.ARDUBLOCK_DIGITAL_READ_DEFINE);
    java.lang.String ret = "__ardublockDigitalRead(";
    ret = ret + (translatorBlock.toCode());
    ret = ret + ")";
    return ((codePrefix) + ret) + (codeSuffix);
}