public java.lang.String toString() {
    java.lang.String result = "";
    if (this.organic) {
        result += "*";
    }
    result += (this.name) + " ";
    if (this.fruit) {
        result += "(F) ";
    }
    result += ("- " + (this.weight)) + " lbs";
    return result;
}