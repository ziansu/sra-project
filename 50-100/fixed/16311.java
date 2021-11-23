static org.observe.Subscription forAll(org.observe.Subscription... subs) {
    return () -> {
        for (int s = 0; s < (subs.length); s++) {
            if (org.observe.Subscription.unsubscribe(subs[s]))
                subs[s] = null;
            
        }
    };
}