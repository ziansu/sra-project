public int compareTo(Graph.GraphWeighted.Edge that) {
    if ((java.lang.Math.abs(((this.weight) - (that.weight)))) > (Graph.GraphWeighted.EPS))
        return java.lang.Double.compare(this.weight, that.weight);
    
    if ((this.from) == (that.from))
        return java.lang.Integer.compare(this.to, that.to);
    
    return java.lang.Integer.compare(this.from, that.from);
}