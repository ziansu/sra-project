public void unsubscribe(java.lang.String topic) {
    for (java.lang.String t : topics) {
        if (t == topic) {
            topics.remove(topics.indexOf(t));
            java.lang.System.out.println((("Unsubscribed from topic " + topic) + "."));
        }else
            java.lang.System.out.println("No such topic to unsubscribe from.");
        
    }
}