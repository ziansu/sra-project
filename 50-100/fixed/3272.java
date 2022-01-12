public int compareTo(Graph.GraphWeighted.Edge that) {
    if ((this.weight) != (that.weight)) {
        return java.lang.Integer.compare(this.weight, that.weight);
    }else
        if ((this.from) != (that.from)) {
            return java.lang.Integer.compare(this.from, that.from);
        }else {
            return java.lang.Integer.compare(this.to, that.to);
        }
    
}