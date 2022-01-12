public void addToStore(com.sjsu.vector.VectorClock vc) {
    int a = vc.getVectorClock()[0];
    int b = vc.getVectorClock()[1];
    int c = vc.getVectorClock()[2];
    com.sjsu.vector.VectorClock nvc = new com.sjsu.vector.VectorClock(new int[]{ a , b , c });
    this.store.add(nvc);
}