public java.lang.String getTemp() {
    temp = content.replace("&", "&amp;");
    temp = temp.replace("<", "&lt;");
    temp = temp.replace(">", "&gt;");
    return temp;
}