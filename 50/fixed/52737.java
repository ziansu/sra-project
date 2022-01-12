public void start(long t, int position) {
    if (position < (competitors.size())) {
        competitors.get(position).start(t);
    }
}