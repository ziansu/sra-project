public com.kiselev.reflection.ui.impl.bytecode.decompile.fernflower.configuration.FernflowerConfiguration defineNewLineCharacter(java.lang.String character) {
    if (character.equals("\n")) {
        configuration.put("nls", com.kiselev.reflection.ui.impl.bytecode.decompile.fernflower.configuration.DecompilerConfiguration.Builder.ONE);
    }else
        if (character.equals("\r\n")) {
            configuration.put("nls", com.kiselev.reflection.ui.impl.bytecode.decompile.fernflower.configuration.DecompilerConfiguration.Builder.ZERO);
        }
    
    return this;
}