public void reset(T object) {
    while ((this.size()) > 1) {
        super.pop();
    } 
    super.push(object);
    numPushes = 0;
    discarded = 0;
}