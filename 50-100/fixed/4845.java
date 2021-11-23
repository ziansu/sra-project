@org.apache.hadoop.classification.InterfaceAudience.Private
public synchronized int getLocalAMRMTokenKeyId() {
    java.lang.Integer keyId = this.localTokenKeyId;
    if (keyId == null) {
        try {
            if ((this.localToken) == null) {
                throw new org.apache.hadoop.yarn.exceptions.YarnRuntimeException(("Missing AMRM token for " + (this.applicationAttemptId)));
            }
            keyId = this.localToken.decodeIdentifier().getKeyId();
            this.localTokenKeyId = keyId;
        } catch (java.io.IOException e) {
            throw new org.apache.hadoop.yarn.exceptions.YarnRuntimeException(("AMRM token decode error for " + (this.applicationAttemptId)), e);
        }
    }
    return keyId;
}