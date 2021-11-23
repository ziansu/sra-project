public java.lang.String getEquString() {
    java.lang.String result = "";
    for (int counter = 0; counter < (this.Equiped.size()); counter++) {
        result = (this.Equiped.get(counter)) + "\n";
    }
    return result;
}