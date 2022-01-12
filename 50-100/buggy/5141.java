void reload_from_file() {
    boolean there_is_file = ((ZenStates) (p)).serializer.check_if_file_exists_in_sketchpath(title);
    if (there_is_file) {
        ((ZenStates) (p)).is_loading = true;
        ((ZenStates) (p)).cp5.setAutoDraw(false);
        StateMachine loaded = ((ZenStates) (p)).serializer.loadSubStateMachine(title);
        mirror(loaded);
    }
}