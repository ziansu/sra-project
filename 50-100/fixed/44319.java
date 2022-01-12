public void calculateInterval() {
    if ((times.size()) > 1) {
        this.intervall = (times.get(1).getTime()) - (times.get(0).getTime());
    }else {
        this.intervall = 0;
    }
}