@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    for (java.lang.Object item : mDataList) {
        stringBuilder.append(item);
        stringBuilder.append(" ");
    }
    if ((stringBuilder.length()) > 0) {
        stringBuilder.deleteCharAt(((stringBuilder.length()) - 1));
    }
    return stringBuilder.toString();
}