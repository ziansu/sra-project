public boolean isComplete() {
    return (finished.isEmpty()) || (!(finished.containsValue(false)));
}