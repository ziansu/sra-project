public static void main(java.lang.String[] args) throws java.io.FileNotFoundException {
    emotion.Emotion emotion = new emotion.Emotion();
    java.util.List<java.lang.String> codes = emotion.getCodes();
    for (java.lang.String str : codes) {
        try {
            java.lang.String html = emotion.html((((com.nju.util.Constant.EMOTION_URL) + str) + "/index.htm"));
            emotion.parseDoc(emotion.document(html));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}