public void setEnd(int end) {
    offsetRange = org.apache.commons.lang3.Range.between(offsetRange.getMinimum(), end);
}