@java.lang.Override
public com.tsasoftdev.fly.FlyResult call() {
    java.lang.String rawtext = getRawFileText(this.f);
    com.tsasoftdev.fly.AsyncParser.InternalFlyParser.TagIdentifier tg = new com.tsasoftdev.fly.AsyncParser.InternalFlyParser.TagIdentifier(rawtext, 5);
    tg.process();
    return new com.tsasoftdev.fly.FlyResult(tg.getTags(), tg.getSubject(), rawtext, this.f.toString().substring(((this.f.toString().lastIndexOf(".")) + 1)), this.f.toURI().toString());
}