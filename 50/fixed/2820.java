public fiftyone.mobile.detection.entities.Signature getSignature() throws java.io.IOException {
    return (signature) != null ? signature : (signatureIndex) != null ? dataset.signatures.get(signatureIndex) : null;
}