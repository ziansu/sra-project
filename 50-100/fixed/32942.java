public java.lang.String toString() {
    java.lang.String result_string = this.start_knoten.name;
    if ((knoten.size()) == 0)
        return result_string;
    
    for (int i = 0; i < (knoten.size()); i++) {
        result_string += (("\t" + (kanten.get(i).type)) + "\t") + (knoten.get(i).name);
    }
    return result_string;
}