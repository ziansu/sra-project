@java.lang.Override
public byte[] executeProvisionRequest(java.util.UUID uuid, com.google.android.exoplayer.drm.ExoMediaDrm.ProvisionRequest request) throws java.io.IOException {
    java.lang.String url = ((request.getDefaultUrl()) + "&signedRequest=") + (new java.lang.String(request.getData()));
    return com.google.android.exoplayer.util.Util.executePost(url, null, null);
}