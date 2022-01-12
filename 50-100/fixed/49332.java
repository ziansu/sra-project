private void startAt(long offset) throws gobblin.source.extractor.extract.kafka.StartOffsetOutOfRangeException {
    if ((offset < (this.earliestOffset)) || (offset > (this.latestOffset))) {
        throw new gobblin.source.extractor.extract.kafka.StartOffsetOutOfRangeException(java.lang.String.format("start offset = %d, earliest offset = %d, latest offset = %d", offset, this.earliestOffset, this.latestOffset));
    }
    this.startOffset = offset;
}