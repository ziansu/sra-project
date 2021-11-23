public void addEventListener(de.learnlib.algorithms.ttt.base.TTTEventListener<I, D> listener) {
    eventListeners.add(new java.lang.ref.WeakReference<de.learnlib.algorithms.ttt.base.TTTEventListener<I, D>>(listener));
}