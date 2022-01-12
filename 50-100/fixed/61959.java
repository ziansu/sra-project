private static void deserializeClassDefinition(java.io.DataInputStream stream, java.util.Map<java.lang.Integer, com.jetbrains.jetpad.vclang.serialization.Definition> definitionMap, com.jetbrains.jetpad.vclang.serialization.ClassDefinition definition, java.util.List<com.jetbrains.jetpad.vclang.VcError> errors) throws com.jetbrains.jetpad.vclang.serialization.ModuleSerialization.DeserializationException, java.io.IOException {
    com.jetbrains.jetpad.vclang.serialization.Universe universe = com.jetbrains.jetpad.vclang.serialization.ModuleSerialization.readUniverse(stream);
    int size = stream.readInt();
    definition.setUniverse(universe);
    for (int i = 0; i < size; ++i) {
        com.jetbrains.jetpad.vclang.serialization.ModuleSerialization.deserializeDefinition(stream, definitionMap, errors);
    }
}