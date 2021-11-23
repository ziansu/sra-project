private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
    java.util.Queue<java.lang.Character> characters = new java.util.ArrayDeque<>();
    java.util.Queue<java.lang.Boolean> structure = new java.util.ArrayDeque<>();
    flatten(characters, structure, this);
    objectOutputStream.writeInt(characters.size());
    for (java.lang.Character character : characters)
        objectOutputStream.writeChar(character);
    
    objectOutputStream.writeInt(structure.size());
    objectOutputStream.write(com.seapip.thomas.huffman.huffman.Util.booleansToBytes(structure));
}