public int compareTo(Radical other) {
    if ((this.rad) < (other.rad))
        return -1;
    else
        if ((this.rad) > (other.rad))
            return -1;
        else
            return (this.n) < (other.n) ? -1 : 1;
        
    
}