public java.net.URL next() {
    (myCurrentIndex)++;
    return myHistory.get(myCurrentIndex);
}