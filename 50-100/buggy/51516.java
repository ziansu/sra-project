public com.liangmayong.airing.AiringObserver unregister(java.lang.String action) {
    if ((com.liangmayong.airing.AiringObserver.unregisterAction) == null) {
        try {
            com.liangmayong.airing.AiringObserver.unregisterAction = com.liangmayong.airing.Airing.class.getDeclaredMethod("unregister", java.lang.Object.class, java.lang.String.class, com.liangmayong.airing.OnAiringListener.class);
            com.liangmayong.airing.AiringObserver.unregisterAction.setAccessible(true);
        } catch (java.lang.Exception e) {
        }
    }
    if ((com.liangmayong.airing.AiringObserver.unregisterAction) != null) {
        try {
            com.liangmayong.airing.AiringObserver.unregisterAction.invoke(airing, object, action);
        } catch (java.lang.Exception e) {
        }
    }
    return this;
}