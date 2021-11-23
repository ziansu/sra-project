@io.ipfs.multihash.Test
public void base58Test() {
    java.util.List<java.lang.String> examples = java.util.Arrays.asList("QmPZ9gcCEpqKTo6aq61g2nXGUhM4iCL3ewB6LDXZCtioEB", "QmatmE9msSfkKxoffpHwNLNKgwZG8eT9Bud6YoPab52vpy");
    for (java.lang.String example : examples) {
        byte[] output = io.ipfs.multihash.Base58.decode(example);
        java.lang.String encoded = io.ipfs.multihash.Base58.encode(output);
        if (!(encoded.equals(example)))
            throw new java.lang.IllegalStateException(((("Incorrect base58! " + example) + " => ") + encoded));
        
    }
}