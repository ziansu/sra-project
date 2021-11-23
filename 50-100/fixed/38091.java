public int compareTo(request.Request other) {
    if (((this.clock) < (other.clock)) || (((this.clock) == (other.clock)) && ((getId()) < (other.getId())))) {
        return -1;
    }
    return 1;
}