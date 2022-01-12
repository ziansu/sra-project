static org.observe.Subscription forAll(org.observe.Subscription... subs) {
    return () -> {
        for (int s = 0; s < (subs.length); s++) {
            if ((subs[s]) != null) {
                subs[s].unsubscribe();
                subs[s] = null;
            }
        }
    };
}