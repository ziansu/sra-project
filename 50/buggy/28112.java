public com.google.cloud.security.scanner.pipelines.LiveStateChecker build() {
    this.scannerDiffOutput = constructPipeline(this.pipeline, this.org, this.knownGoodSource);
    return this;
}