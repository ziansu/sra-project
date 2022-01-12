public java.lang.String getSelectedQualifierValues() {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (int i = 0; i < (getItemCount()); i++) {
        if (checkedItems[i]) {
            result.append(qualifierValues[i]).append("-");
        }
    }
    if ((result.length()) > 0) {
        result.deleteCharAt(((result.length()) - 1));
    }
    return result.toString();
}