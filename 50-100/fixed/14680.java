public void setState(java.lang.Integer state) {
    this.state = state;
    this.color = "black";
    if (this.state.equals(1))
        this.color = "green";
    
    if (this.state.equals(0))
        this.color = "red";
    
}