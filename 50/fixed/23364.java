public server.Message.MessageObject Dequeue() {
    synchronized(m_Queue) {
        if (m_Queue.isEmpty()) {
            return null;
        }
        return m_Queue.remove();
    }
}