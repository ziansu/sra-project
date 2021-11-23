private void turnNext(int current) {
    if (current != (recyclerView.getChildCount())) {
        (turn)++;
        setTurned(current);
    }else {
        turnFirst();
    }
}