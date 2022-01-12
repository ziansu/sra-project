public static uk.ac.cam.cl.quebec.face.messages.TrainOnVideoMessage constructFromJson(org.json.simple.JSONObject json) {
    uk.ac.cam.cl.quebec.face.messages.TrainOnVideoMessage message = new uk.ac.cam.cl.quebec.face.messages.TrainOnVideoMessage();
    message.S3Path = ((java.lang.String) (json.get("S3ID")));
    message.userId = ((java.lang.String) (json.get("userID")));
    message.videoId = getInt(json, "videoID");
    return message;
}