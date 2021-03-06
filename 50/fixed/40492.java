private void addListener(com.google.firebase.database.Query ref, com.google.firebase.database.ValueEventListener listener) {
    synchronized(mListeners) {
        if (mListeners.containsKey(ref))
            return ;
        
        ref.addValueEventListener(listener);
        mListeners.put(ref, listener);
    }
}