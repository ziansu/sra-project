public java.lang.String getCurrentLabel() {
    java.lang.Character base = this.getCurrentBase();
    java.lang.String output = (base == 0) ? "" : base + "";
    if (base == 0)
        for (java.lang.Character c : this.getCurrentBases())
            output += c;
        
    
    return output;
}