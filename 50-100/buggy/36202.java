public java.lang.String toString() {
    if ((this.tage) > 0)
        return ((((("" + (this.stunden)) + ":") + (this.minuten)) + " --> ") + (this.tage)) + " Tage vorher.";
    else
        return (("" + (this.stunden)) + ":") + (this.minuten);
    
}