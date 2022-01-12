private ddg.kernel.Event parseWriteEvent(java.util.StringTokenizer tokenizer) {
    ddg.kernel.Time[] timestampAndDuration = parseTime(tokenizer.nextToken());
    java.lang.String filePath = tokenizer.nextToken();
    long length = java.lang.Long.parseLong(tokenizer.nextToken());
    return new ddg.emulator.event.filesystem.WriteEvent(client, timestampAndDuration[0], length, timestampAndDuration[2], filePath);
}