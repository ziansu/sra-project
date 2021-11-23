private void updateBar(final double VALUE) {
    java.lang.System.out.println(formatString);
    valueText.setText(java.lang.String.format(locale, formatString, VALUE));
    valueText.setX((((width) - ((size) * 0.05)) - (valueText.getLayoutBounds().getWidth())));
    bar.setWidth((VALUE * (stepSize)));
}