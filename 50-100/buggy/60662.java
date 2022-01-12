private WyilFile.Type readTypeBlock() throws java.io.IOException {
    int nameIdx = input.read_uv();
    int modifiers = input.read_uv();
    int typeIdx = input.read_uv();
    input.pad_u8();
    wyil.io.CodeForest forest = readCodeForestBlock();
    return new wyil.io.WyilFile.Type(generateModifiers(modifiers), stringPool[nameIdx], typePool[typeIdx], forest);
}