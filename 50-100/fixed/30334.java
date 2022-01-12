public void deleteItem(quicknote.storage.QuickNoteUserDataItem deleteThisNote) {
    com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper mapper = createDynamoDBMapper();
    java.lang.System.out.println((((((deleteThisNote.getCustomerId()) + " ") + (deleteThisNote.getNoteBody())) + " ") + (deleteThisNote.getNoteName())));
    mapper.delete(deleteThisNote);
}