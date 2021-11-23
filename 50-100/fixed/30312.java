public int[] compareSignatures(byte[] chunk) {
    for (int i = 0; i < (signatures.size()); i++) {
        for (int j = 0; j < (signatures.get(i).size()); j++) {
            if (matchLPC(chunk, i, j))
                return new int[]{ i , j };
            
        }
    }
    return new int[]{ -1 , -1 };
}