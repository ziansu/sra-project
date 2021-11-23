@java.lang.Override
protected java.util.ArrayList<java.lang.String> doInBackground(java.lang.String... strings) {
    java.util.List<com.hanuor.onyx.helper.RecognitionResult> results = clarifai.recognize(new com.hanuor.onyx.helper.RecognitionRequest(tags.urls));
    if ((results.size()) != 0) {
        for (com.hanuor.onyx.helper.Tag tag : results.get(0).getTags()) {
            probableTags.add(tag.getName());
        }
        return probableTags;
    }else {
        return null;
    }
}