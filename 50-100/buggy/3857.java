public org.embulk.input.kafka.data.format.base.Data build() {
    java.lang.String[] data = new java.lang.String(message).split(separator);
    for (int idx = 0; idx < (data.length); idx++) {
        set(idx, data[idx]);
    }
    return this;
}