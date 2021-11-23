public static void main(java.lang.String[] args) throws java.io.FileNotFoundException {
    emotion.Emotion emotion = new emotion.Emotion();
    java.util.List<java.lang.String> codes = emotion.getCodes();
    try {
        java.lang.String html = emotion.html((((com.nju.util.Constant.EMOTION_URL) + "1F338") + "/index.htm"));
        emotion.parseDoc(emotion.document(html));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}