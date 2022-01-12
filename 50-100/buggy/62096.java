public boolean equals(java.lang.Object o) {
    if (o == null) {
        return false;
    }else
        if (o instanceof State) {
            if ((((State) (o)).getName()) == (this.getName())) {
                return true;
            }
        }
    
    return false;
}