public android.view.View onViewCreated(android.view.View view, android.content.Context context, android.util.AttributeSet attrs) {
    if (view == null) {
        return null;
    }
    view = onViewCreatedInternal(view, context, attrs);
    for (com.prolificinteractive.parallaxpager.OnViewCreatedListener listener : otherListeners) {
        if (listener != null) {
            view = listener.onViewCreated(view, context, attrs);
        }
    }
    return view;
}