public java.lang.String toString() {
    java.lang.String result = (this.name) + ";";
    for (statistics.NumDevCategories c : statistics.NumDevCategories.values()) {
        java.lang.String cat = c.toString();
        int[] values = this.authorsSummary.get(cat);
        for (int i = 0; i < (values.length); i++) {
            result = (result + ";") + (values[i]);
        }
    }
    return result;
}