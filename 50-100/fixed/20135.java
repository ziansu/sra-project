public void unsubscribe(java.lang.String topic) {
    if (topics.contains(topic)) {
        topics.remove(topics.indexOf(topic));
        java.lang.System.out.println((("Unsubscribed from topic " + topic) + "."));
    }else
        java.lang.System.out.println("No such topic to unsubscribe from.");
    
}