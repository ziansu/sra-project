private void writeKeySpecs(java.lang.String filename, java.security.spec.EncodedKeySpec keySpec) {
    try (java.io.FileOutputStream keyOutput = new java.io.FileOutputStream(filename, false)) {
        keyOutput.write(keySpec.getEncoded());
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Can't write to file " + filename));
        java.lang.System.exit((-1));
    }
}