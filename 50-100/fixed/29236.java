@java.lang.Override
public net.time4j.format.expert.FormatProcessor<V> withElement(net.time4j.engine.ChronoElement<V> element) {
    if ((this.protectedMode) || ((this.element) == element)) {
        return this;
    }
    return new net.time4j.format.expert.NumberProcessor(element, this.fixedWidth, this.minDigits, this.maxDigits, this.signPolicy, false);
}