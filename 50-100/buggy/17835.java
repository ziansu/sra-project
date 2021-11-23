public void subscribe(java.lang.String topic) {
    for (java.lang.String t : topics) {
        if (t == topic)
            java.lang.System.out.println((("Already subscribed to the topic " + topic) + "."));
        else {
            topics.add(topic);
            java.lang.System.out.println((("Subscribed to the topic " + topic) + "."));
        }
    }
}