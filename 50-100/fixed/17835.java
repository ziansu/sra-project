public void subscribe(java.lang.String topic) {
    if (topics.contains(topic)) {
        java.lang.System.out.println((("Already subscribed to the topic " + topic) + "."));
    }else {
        topics.add(topic);
        java.lang.System.out.println((("Subscribed to the topic " + topic) + "."));
    }
}