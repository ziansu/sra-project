public java.lang.String toString() {
    java.lang.String result = "";
    if (organic) {
        result += "*";
    }
    result += (name) + " ";
    if (fruit) {
        result += "(F) ";
    }
    result += ("- " + (weight)) + " lbs";
    return result;
}