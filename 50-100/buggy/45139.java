public java.lang.String[] toArray() {
    if ((this.get) && (!(this.post))) {
        return new java.lang.String[]{ "GET" };
    }else
        if ((this.post) && (!(this.get))) {
            return new java.lang.String[]{ "GET" };
        }else
            if ((this.get) && (this.post)) {
                return new java.lang.String[]{ "GET" , "POST" };
            }
        
    
    return EMPTY;
}