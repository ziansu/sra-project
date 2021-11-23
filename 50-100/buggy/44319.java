public void calculateInterval() {
    java.lang.System.out.println("intervall");
    if ((times.size()) > 1) {
        this.intervall = (times.get(1).getTime()) - (times.get(0).getTime());
    }else {
        this.intervall = 0;
    }
    java.lang.System.out.println(this.intervall);
}