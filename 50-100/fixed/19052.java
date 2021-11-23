public static void main(java.lang.String[] args) throws java.io.IOException {
    A51.A51.validateInput(args);
    java.lang.String encryptedFile = A51.A51.encrypt(A51.A51.inputFile, A51.A51.key, A51.A51.frameNumber);
    java.lang.String decryptedFile = A51.A51.decrypt(encryptedFile, A51.A51.key, A51.A51.frameNumber);
}