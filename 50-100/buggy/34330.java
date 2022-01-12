@java.lang.Override
public java.lang.String toCode() throws com.ardublock.translator.block.exception.SocketNullException, com.ardublock.translator.block.exception.SubroutineNotDeclaredException {
    java.lang.String ret = "analogRead(A";
    com.ardublock.translator.block.TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
    if (translatorBlock instanceof com.ardublock.translator.block.NumberBlock) {
        ret = ret + (translatorBlock.toCode());
        ret = ret + ") > 1000";
        return ((codePrefix) + ret) + (codeSuffix);
    }else {
        throw new com.ardublock.translator.block.exception.BlockException(blockId, "analog pin# must be a number");
    }
}