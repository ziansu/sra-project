public java.util.ArrayList<java.lang.Double> map(double x, double y) {
    java.util.ArrayList<java.lang.Double> res = new java.util.ArrayList<java.lang.Double>();
    res.add((x + (this.x)));
    res.add((y + (this.y)));
    if ((this.getNext()) == null)
        return res;
    else
        return this.getNext().map(res.get(0), res.get(1));
    
}