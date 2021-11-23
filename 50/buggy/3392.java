public void trimRight(int delta) {
    length -= delta;
    java.lang.String text = element.getInnerText();
    element.setInnerText(text.substring(((text.length()) - delta), text.length()));
}