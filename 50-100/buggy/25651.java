public void onMessage(java.lang.String name, java.util.Map<java.lang.String, java.lang.String> data) {
    if ((_actor) != null)
        exec.execute(() -> {
            if (_actor.onMessage(name, data))
                interactionEnded();
            
        });
    else
        onErrorOutput("Message received outside of interaction [name=%s, data=%s]".format(name, data));
    
}