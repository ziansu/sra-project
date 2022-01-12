void emitLogMethodEntry() {
    super.visitCode();
    dyco4j.instrumentation.LoggingHelper.emitLogMethodEntry(this.mv, this.methodId);
}