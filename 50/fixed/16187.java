public boolean needUpdate() {
    int[] days = hasDaysExact();
    return (days != null) && (((days[1]) - (days[0])) < 7);
}