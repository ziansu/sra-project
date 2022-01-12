public void addToStore(com.sjsu.vector.VectorClock vc) {
    int a = this.getVectorClock().getVectorClock()[0];
    int b = this.getVectorClock().getVectorClock()[1];
    int c = this.getVectorClock().getVectorClock()[2];
    com.sjsu.vector.VectorClock nvc = new com.sjsu.vector.VectorClock(new int[]{ a , b , c });
    this.store.add(nvc);
}