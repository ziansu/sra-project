private static void signContents(final com.hp.hpl.jena.query.Dataset msgDataset, final won.cryptography.rdfsign.SigningStage sigStage, final won.cryptography.rdfsign.WonSigner signer, final java.security.PrivateKey privateKey, final java.lang.String privateKeyUri, final java.security.PublicKey publicKey) throws java.lang.Exception {
    java.util.List<won.protocol.message.WonSignatureData> sigRefs = signer.sign(privateKey, privateKeyUri, publicKey, sigStage.getUnsignedContentUris());
    for (won.protocol.message.WonSignatureData sigRef : sigRefs) {
        java.lang.String envUri = sigStage.getEnvelopeUriContainingContent(sigRef.getSignedGraphUri());
        won.protocol.message.processor.impl.WonMessageSignerVerifier.addSignature(sigStage.getMessageUri(envUri), sigRef, envUri, msgDataset);
    }
}