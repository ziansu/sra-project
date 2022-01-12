@java.lang.Override
protected de.teiesti.postie.Postman<Letter> reportStart() {
    for (de.teiesti.postie.Recipient<Letter> r : recipients) {
        phaser.register();
        es.submit(new StartReporter(r, this));
    }
    phaser.arriveAndAwaitAdvance();
    return this;
}