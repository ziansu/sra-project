void save(org.zakariya.mrdoodleserver.sync.TimestampRecord target) {
    for (org.zakariya.mrdoodleserver.sync.TimestampRecord.Entry entry : entriesByUuid.values()) {
        target.entriesByUuid.put(entry.getModelId(), entry);
    }
    target.save();
}