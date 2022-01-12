@java.lang.Override
public java.lang.String getTopics(java.io.File document) {
    if (!(document.isFile())) {
        java.lang.String topicName = document.getName().split("_")[0];
        if ((this.testTopics.contains(topicName)) || (this.trainTopics.contains(topicName))) {
            return topicName;
        }else {
            throw new java.lang.IllegalArgumentException("File isn't in the topics or File Name are not in correct Format");
        }
    }else {
        throw new java.lang.IllegalArgumentException(("can't use File: " + document));
    }
}