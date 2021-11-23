public fiftyone.mobile.detection.entities.Signature getSignature() throws java.io.IOException {
    return (signature) != null ? signature : dataset.signatures.get(signatureIndex);
}