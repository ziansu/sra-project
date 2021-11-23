private android.view.View findViewById(int id) {
    if ((activity) != null)
        return activity.findViewById(id);
    
    if ((fragment) != null) {
        return fragment.getView().findViewById(id);
    }
    return null;
}