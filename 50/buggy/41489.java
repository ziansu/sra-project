public void setBegin(int begin) {
    offsetRange = org.apache.commons.lang3.Range.between(begin, offsetRange.getMaximum());
}