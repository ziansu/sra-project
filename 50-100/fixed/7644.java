public java.lang.String getMultiVector() {
    if (this.multicast) {
        java.lang.String ans = "";
        for (int i = 0; i < (groupSize); i++)
            ans += (multicastVector[i]) + " ";
        
        return ans;
    }else
        return "no multi";
    
}