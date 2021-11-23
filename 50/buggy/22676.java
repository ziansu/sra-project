public java.lang.String replaceTag(java.lang.String des) {
    return des.replaceAll("</p>|<br>", "\n").replaceAll("<.+?>", "");
}