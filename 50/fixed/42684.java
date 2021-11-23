public void setSize(groovy.lang.IntRange maxSize) {
    if (maxSize != null) {
        this.maxSize = maxSize.getTo();
        this.minSize = maxSize.getFrom();
    }
}