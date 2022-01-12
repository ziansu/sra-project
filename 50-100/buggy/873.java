private void triggerListener(dev.blunch.blunch.utils.Repository.OnChangedListener listener, dev.blunch.blunch.utils.Repository.OnChangedListener.EventType type) {
    if (type == (Repository.OnChangedListener.EventType.Full)) {
        loaded += 1;
    }
    if ((loaded) == (loadNeed)) {
        listener.onChanged(Repository.OnChangedListener.EventType.Full);
        android.util.Log.e("ROOOOOO", type.toString());
    }else {
        if (type == (Repository.OnChangedListener.EventType.Full)) {
            type = Repository.OnChangedListener.EventType.Added;
        }
        android.util.Log.e("ROOOOOO", type.toString());
        listener.onChanged(type);
    }
}