public synchronized void sendMessage(java.lang.String s, com.roboclub.robobuggy.ros.Message m) {
    inbox.add(new java.util.AbstractMap.SimpleEntry<java.lang.String, com.roboclub.robobuggy.ros.Message>(s, m));
}