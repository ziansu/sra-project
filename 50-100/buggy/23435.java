private void addConnectionToNote(java.lang.String noteId, org.apache.zeppelin.socket.NotebookSocket socket) {
    synchronized(noteSocketMap) {
        removeConnectionFromAllNote(socket);
        java.util.List<org.apache.zeppelin.socket.NotebookSocket> socketList = noteSocketMap.get(noteId);
        if (socketList == null) {
            socketList = new java.util.LinkedList<org.apache.zeppelin.socket.NotebookSocket>();
            noteSocketMap.put(noteId, socketList);
        }
        if ((socketList.contains(socket)) == false) {
            socketList.add(socket);
        }
    }
}