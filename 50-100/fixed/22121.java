public java.lang.String getCurrentLabel() {
    java.lang.Character base = this.getCurrentBase();
    java.lang.String output = (base == null) ? "" : base + "";
    if (base == null)
        for (java.lang.Character c : this.getCurrentBases())
            output += c;
        
    
    return output;
}