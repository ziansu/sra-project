private void uploadPost(org.json.JSONObject json) {
    try {
        org.deeplearning4j.gym.ClientUtils.post(((((url) + (org.deeplearning4j.gym.Client.V1_ROOT)) + (instanceId)) + (org.deeplearning4j.gym.Client.UPLOAD)), json);
    } catch (java.lang.RuntimeException e) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger("Client Upload");
        logger.log(java.util.logging.Level.SEVERE, "Impossible to upload: Wrong API key?");
    }
}