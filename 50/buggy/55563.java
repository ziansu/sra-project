@java.lang.Override
public com.madara.KnowledgeRecord get(int index) {
    return com.madara.KnowledgeRecord.fromPointer(knowledgeRecords[index]);
}