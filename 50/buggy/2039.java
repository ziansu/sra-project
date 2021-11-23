public void setCredibility(double credibility) {
    if ((credibility > 1) || (credibility < 0)) {
        print("Credibility has to be between 0 and 1");
    }else {
        this.credibility = credibility;
    }
}